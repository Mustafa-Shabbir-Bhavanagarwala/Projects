import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordCount {

    /**
      Class TokenizerMapper defines the Map part of this MapReduce job.
      It implements (only) a method map(...)
      Arguments are KeyIn, ValueIn, KeyOut, ValueOut, Context
      For word count mapper,
       * There is no KeyIn (the mapper gets one value only)
       * ValueIn is a line of text
       * KeyOut is a word (string), and ValueOut is a number (the count, always 1)
       * Context is a stream the mapper writes its (key, value) pairs to
    **/
    
    public static class TokenizerMapper	extends Mapper<Object, Text, Text, IntWritable> {

	// Containers that hold the word and the count
	private Text word = new Text();
	private final static IntWritable count = new IntWritable();

	public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
	    StringTokenizer itr = new StringTokenizer(value.toString());
	    while (itr.hasMoreTokens()) {
		word.set(itr.nextToken());
		count.set(1);
		context.write(word, count);
	    }
	}
    }

    /**
       Class IntSumReducer defines the Reduce part of this MapReduce job.
       It implements (only) a method reduce(...)
       Arguments are KeyIn, ValueIn, KeyOut, ValueOut, Context
       For word count reducer,
       * KeyIn is the word
       * ValueIn is an iterable over numbers 
       * KeyOut is theword
       * ValueOut is the sum
       * Context is a stream the reducer writes its (key, value) pairs to
       **/

    public static class IntSumReducer extends Reducer<Text,IntWritable,Text,IntWritable> {

	    // Container to hold the sum
	    private IntWritable result = new IntWritable();

	    public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
		int sum = 0;
		for (IntWritable val : values) {
		    sum += val.get();
		}
		result.set(sum);
		context.write(key, result);
	    }
    }

    //  This part holds configuration information for the MapReduce job
    public static void main(String[] args) throws Exception {
	Configuration conf = new Configuration();
	// Give the job a name
	Job job = Job.getInstance(conf, "Word Count");

	// Class that contains all the map/reduce/configuration info
	job.setJarByClass(WordCount.class);
    
	// Set the mapper, and the types of its key and value
	job.setMapperClass(TokenizerMapper.class);
	job.setMapOutputKeyClass(Text.class);
	job.setMapOutputValueClass(IntWritable.class);

	// Set the reducer, and the types of its key and value
	job.setReducerClass(IntSumReducer.class);
	job.setOutputKeyClass(Text.class);
	job.setOutputValueClass(IntWritable.class);
    
	// Job will find its input from the first command-line argument (location in HDFS)
	FileInputFormat.addInputPath(job, new Path(args[0]));
	// Job will write its output to the second command-line argument (location in HDFS)
	FileOutputFormat.setOutputPath(job, new Path(args[1]));

	// Exit status (0 is success, anything else is failure
	System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}

