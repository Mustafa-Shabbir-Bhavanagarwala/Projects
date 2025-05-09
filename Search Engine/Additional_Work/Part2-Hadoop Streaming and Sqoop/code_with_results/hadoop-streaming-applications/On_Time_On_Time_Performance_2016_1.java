// ORM class for table 'On_Time_On_Time_Performance_2016_1'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Apr 12 22:52:52 UTC 2024
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class On_Time_On_Time_Performance_2016_1 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ActualElapsedTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.ActualElapsedTime = (Float)value;
      }
    });
    setters.put("AirlineID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.AirlineID = (Integer)value;
      }
    });
    setters.put("AirTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.AirTime = (Float)value;
      }
    });
    setters.put("ArrDel15", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.ArrDel15 = (Integer)value;
      }
    });
    setters.put("ArrDelay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.ArrDelay = (java.math.BigDecimal)value;
      }
    });
    setters.put("ArrDelayMinutes", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.ArrDelayMinutes = (Float)value;
      }
    });
    setters.put("ArrivalDelayGroups", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.ArrivalDelayGroups = (Integer)value;
      }
    });
    setters.put("ArrTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.ArrTime = (Integer)value;
      }
    });
    setters.put("ArrTimeBlk", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.ArrTimeBlk = (String)value;
      }
    });
    setters.put("CancellationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.CancellationCode = (String)value;
      }
    });
    setters.put("Cancelled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Cancelled = (Integer)value;
      }
    });
    setters.put("Carrier", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Carrier = (String)value;
      }
    });
    setters.put("CarrierDelay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.CarrierDelay = (java.math.BigDecimal)value;
      }
    });
    setters.put("CRSArrTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.CRSArrTime = (Integer)value;
      }
    });
    setters.put("CRSDepTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.CRSDepTime = (Integer)value;
      }
    });
    setters.put("CRSElapsedTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.CRSElapsedTime = (Float)value;
      }
    });
    setters.put("DayofMonth", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DayofMonth = (Integer)value;
      }
    });
    setters.put("DayOfWeek", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DayOfWeek = (Integer)value;
      }
    });
    setters.put("DepartureDelayGroups", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DepartureDelayGroups = (Integer)value;
      }
    });
    setters.put("DepDel15", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DepDel15 = (Integer)value;
      }
    });
    setters.put("DepDelay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DepDelay = (java.math.BigDecimal)value;
      }
    });
    setters.put("DepDelayMinutes", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DepDelayMinutes = (Float)value;
      }
    });
    setters.put("DepTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DepTime = (Integer)value;
      }
    });
    setters.put("DepTimeBlk", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DepTimeBlk = (String)value;
      }
    });
    setters.put("Dest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Dest = (String)value;
      }
    });
    setters.put("DestAirportID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DestAirportID = (Integer)value;
      }
    });
    setters.put("DestAirportSeqID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DestAirportSeqID = (Integer)value;
      }
    });
    setters.put("DestCityMarketID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DestCityMarketID = (Integer)value;
      }
    });
    setters.put("DestCityName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DestCityName = (String)value;
      }
    });
    setters.put("DestState", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DestState = (String)value;
      }
    });
    setters.put("DestStateFips", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DestStateFips = (Integer)value;
      }
    });
    setters.put("DestStateName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DestStateName = (String)value;
      }
    });
    setters.put("DestWac", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DestWac = (Integer)value;
      }
    });
    setters.put("Distance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Distance = (Float)value;
      }
    });
    setters.put("DistanceGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DistanceGroup = (Integer)value;
      }
    });
    setters.put("Div1Airport", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div1Airport = (String)value;
      }
    });
    setters.put("Div1AirportID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div1AirportID = (Integer)value;
      }
    });
    setters.put("Div1AirportSeqID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div1AirportSeqID = (Integer)value;
      }
    });
    setters.put("Div1LongestGTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div1LongestGTime = (java.math.BigDecimal)value;
      }
    });
    setters.put("Div1TailNum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div1TailNum = (String)value;
      }
    });
    setters.put("Div1TotalGTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div1TotalGTime = (java.math.BigDecimal)value;
      }
    });
    setters.put("Div1WheelsOff", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div1WheelsOff = (java.math.BigDecimal)value;
      }
    });
    setters.put("Div1WheelsOn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div1WheelsOn = (java.math.BigDecimal)value;
      }
    });
    setters.put("Div2Airport", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div2Airport = (String)value;
      }
    });
    setters.put("Div2AirportID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div2AirportID = (Integer)value;
      }
    });
    setters.put("Div2AirportSeqID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div2AirportSeqID = (Integer)value;
      }
    });
    setters.put("Div2LongestGTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div2LongestGTime = (java.math.BigDecimal)value;
      }
    });
    setters.put("Div2TotalGTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div2TotalGTime = (java.math.BigDecimal)value;
      }
    });
    setters.put("Div2WheelsOn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Div2WheelsOn = (java.math.BigDecimal)value;
      }
    });
    setters.put("DivActualElapsedTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DivActualElapsedTime = (java.math.BigDecimal)value;
      }
    });
    setters.put("DivAirportLandings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DivAirportLandings = (Integer)value;
      }
    });
    setters.put("DivArrDelay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DivArrDelay = (java.math.BigDecimal)value;
      }
    });
    setters.put("DivDistance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DivDistance = (java.math.BigDecimal)value;
      }
    });
    setters.put("Diverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Diverted = (Integer)value;
      }
    });
    setters.put("DivReachedDest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.DivReachedDest = (java.math.BigDecimal)value;
      }
    });
    setters.put("FirstDepTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.FirstDepTime = (java.math.BigDecimal)value;
      }
    });
    setters.put("FlightDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.FlightDate = (java.sql.Date)value;
      }
    });
    setters.put("FlightNum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.FlightNum = (Integer)value;
      }
    });
    setters.put("Flights", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Flights = (Float)value;
      }
    });
    setters.put("LateAircraftDelay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.LateAircraftDelay = (java.math.BigDecimal)value;
      }
    });
    setters.put("LongestAddGTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.LongestAddGTime = (java.math.BigDecimal)value;
      }
    });
    setters.put("Month", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Month = (Integer)value;
      }
    });
    setters.put("NASDelay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.NASDelay = (java.math.BigDecimal)value;
      }
    });
    setters.put("Origin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Origin = (String)value;
      }
    });
    setters.put("OriginAirportID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.OriginAirportID = (Integer)value;
      }
    });
    setters.put("OriginAirportSeqID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.OriginAirportSeqID = (Integer)value;
      }
    });
    setters.put("OriginCityMarketID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.OriginCityMarketID = (Integer)value;
      }
    });
    setters.put("OriginCityName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.OriginCityName = (String)value;
      }
    });
    setters.put("OriginState", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.OriginState = (String)value;
      }
    });
    setters.put("OriginStateFips", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.OriginStateFips = (Integer)value;
      }
    });
    setters.put("OriginStateName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.OriginStateName = (String)value;
      }
    });
    setters.put("OriginWac", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.OriginWac = (Integer)value;
      }
    });
    setters.put("Quarter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Quarter = (Integer)value;
      }
    });
    setters.put("SecurityDelay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.SecurityDelay = (java.math.BigDecimal)value;
      }
    });
    setters.put("TailNum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.TailNum = (String)value;
      }
    });
    setters.put("TaxiIn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.TaxiIn = (Float)value;
      }
    });
    setters.put("TaxiOut", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.TaxiOut = (Float)value;
      }
    });
    setters.put("TotalAddGTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.TotalAddGTime = (java.math.BigDecimal)value;
      }
    });
    setters.put("UniqueCarrier", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.UniqueCarrier = (String)value;
      }
    });
    setters.put("WeatherDelay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.WeatherDelay = (java.math.BigDecimal)value;
      }
    });
    setters.put("WheelsOff", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.WheelsOff = (Integer)value;
      }
    });
    setters.put("WheelsOn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.WheelsOn = (Integer)value;
      }
    });
    setters.put("Year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        On_Time_On_Time_Performance_2016_1.this.Year = (Integer)value;
      }
    });
  }
  public On_Time_On_Time_Performance_2016_1() {
    init0();
  }
  private Float ActualElapsedTime;
  public Float get_ActualElapsedTime() {
    return ActualElapsedTime;
  }
  public void set_ActualElapsedTime(Float ActualElapsedTime) {
    this.ActualElapsedTime = ActualElapsedTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_ActualElapsedTime(Float ActualElapsedTime) {
    this.ActualElapsedTime = ActualElapsedTime;
    return this;
  }
  private Integer AirlineID;
  public Integer get_AirlineID() {
    return AirlineID;
  }
  public void set_AirlineID(Integer AirlineID) {
    this.AirlineID = AirlineID;
  }
  public On_Time_On_Time_Performance_2016_1 with_AirlineID(Integer AirlineID) {
    this.AirlineID = AirlineID;
    return this;
  }
  private Float AirTime;
  public Float get_AirTime() {
    return AirTime;
  }
  public void set_AirTime(Float AirTime) {
    this.AirTime = AirTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_AirTime(Float AirTime) {
    this.AirTime = AirTime;
    return this;
  }
  private Integer ArrDel15;
  public Integer get_ArrDel15() {
    return ArrDel15;
  }
  public void set_ArrDel15(Integer ArrDel15) {
    this.ArrDel15 = ArrDel15;
  }
  public On_Time_On_Time_Performance_2016_1 with_ArrDel15(Integer ArrDel15) {
    this.ArrDel15 = ArrDel15;
    return this;
  }
  private java.math.BigDecimal ArrDelay;
  public java.math.BigDecimal get_ArrDelay() {
    return ArrDelay;
  }
  public void set_ArrDelay(java.math.BigDecimal ArrDelay) {
    this.ArrDelay = ArrDelay;
  }
  public On_Time_On_Time_Performance_2016_1 with_ArrDelay(java.math.BigDecimal ArrDelay) {
    this.ArrDelay = ArrDelay;
    return this;
  }
  private Float ArrDelayMinutes;
  public Float get_ArrDelayMinutes() {
    return ArrDelayMinutes;
  }
  public void set_ArrDelayMinutes(Float ArrDelayMinutes) {
    this.ArrDelayMinutes = ArrDelayMinutes;
  }
  public On_Time_On_Time_Performance_2016_1 with_ArrDelayMinutes(Float ArrDelayMinutes) {
    this.ArrDelayMinutes = ArrDelayMinutes;
    return this;
  }
  private Integer ArrivalDelayGroups;
  public Integer get_ArrivalDelayGroups() {
    return ArrivalDelayGroups;
  }
  public void set_ArrivalDelayGroups(Integer ArrivalDelayGroups) {
    this.ArrivalDelayGroups = ArrivalDelayGroups;
  }
  public On_Time_On_Time_Performance_2016_1 with_ArrivalDelayGroups(Integer ArrivalDelayGroups) {
    this.ArrivalDelayGroups = ArrivalDelayGroups;
    return this;
  }
  private Integer ArrTime;
  public Integer get_ArrTime() {
    return ArrTime;
  }
  public void set_ArrTime(Integer ArrTime) {
    this.ArrTime = ArrTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_ArrTime(Integer ArrTime) {
    this.ArrTime = ArrTime;
    return this;
  }
  private String ArrTimeBlk;
  public String get_ArrTimeBlk() {
    return ArrTimeBlk;
  }
  public void set_ArrTimeBlk(String ArrTimeBlk) {
    this.ArrTimeBlk = ArrTimeBlk;
  }
  public On_Time_On_Time_Performance_2016_1 with_ArrTimeBlk(String ArrTimeBlk) {
    this.ArrTimeBlk = ArrTimeBlk;
    return this;
  }
  private String CancellationCode;
  public String get_CancellationCode() {
    return CancellationCode;
  }
  public void set_CancellationCode(String CancellationCode) {
    this.CancellationCode = CancellationCode;
  }
  public On_Time_On_Time_Performance_2016_1 with_CancellationCode(String CancellationCode) {
    this.CancellationCode = CancellationCode;
    return this;
  }
  private Integer Cancelled;
  public Integer get_Cancelled() {
    return Cancelled;
  }
  public void set_Cancelled(Integer Cancelled) {
    this.Cancelled = Cancelled;
  }
  public On_Time_On_Time_Performance_2016_1 with_Cancelled(Integer Cancelled) {
    this.Cancelled = Cancelled;
    return this;
  }
  private String Carrier;
  public String get_Carrier() {
    return Carrier;
  }
  public void set_Carrier(String Carrier) {
    this.Carrier = Carrier;
  }
  public On_Time_On_Time_Performance_2016_1 with_Carrier(String Carrier) {
    this.Carrier = Carrier;
    return this;
  }
  private java.math.BigDecimal CarrierDelay;
  public java.math.BigDecimal get_CarrierDelay() {
    return CarrierDelay;
  }
  public void set_CarrierDelay(java.math.BigDecimal CarrierDelay) {
    this.CarrierDelay = CarrierDelay;
  }
  public On_Time_On_Time_Performance_2016_1 with_CarrierDelay(java.math.BigDecimal CarrierDelay) {
    this.CarrierDelay = CarrierDelay;
    return this;
  }
  private Integer CRSArrTime;
  public Integer get_CRSArrTime() {
    return CRSArrTime;
  }
  public void set_CRSArrTime(Integer CRSArrTime) {
    this.CRSArrTime = CRSArrTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_CRSArrTime(Integer CRSArrTime) {
    this.CRSArrTime = CRSArrTime;
    return this;
  }
  private Integer CRSDepTime;
  public Integer get_CRSDepTime() {
    return CRSDepTime;
  }
  public void set_CRSDepTime(Integer CRSDepTime) {
    this.CRSDepTime = CRSDepTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_CRSDepTime(Integer CRSDepTime) {
    this.CRSDepTime = CRSDepTime;
    return this;
  }
  private Float CRSElapsedTime;
  public Float get_CRSElapsedTime() {
    return CRSElapsedTime;
  }
  public void set_CRSElapsedTime(Float CRSElapsedTime) {
    this.CRSElapsedTime = CRSElapsedTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_CRSElapsedTime(Float CRSElapsedTime) {
    this.CRSElapsedTime = CRSElapsedTime;
    return this;
  }
  private Integer DayofMonth;
  public Integer get_DayofMonth() {
    return DayofMonth;
  }
  public void set_DayofMonth(Integer DayofMonth) {
    this.DayofMonth = DayofMonth;
  }
  public On_Time_On_Time_Performance_2016_1 with_DayofMonth(Integer DayofMonth) {
    this.DayofMonth = DayofMonth;
    return this;
  }
  private Integer DayOfWeek;
  public Integer get_DayOfWeek() {
    return DayOfWeek;
  }
  public void set_DayOfWeek(Integer DayOfWeek) {
    this.DayOfWeek = DayOfWeek;
  }
  public On_Time_On_Time_Performance_2016_1 with_DayOfWeek(Integer DayOfWeek) {
    this.DayOfWeek = DayOfWeek;
    return this;
  }
  private Integer DepartureDelayGroups;
  public Integer get_DepartureDelayGroups() {
    return DepartureDelayGroups;
  }
  public void set_DepartureDelayGroups(Integer DepartureDelayGroups) {
    this.DepartureDelayGroups = DepartureDelayGroups;
  }
  public On_Time_On_Time_Performance_2016_1 with_DepartureDelayGroups(Integer DepartureDelayGroups) {
    this.DepartureDelayGroups = DepartureDelayGroups;
    return this;
  }
  private Integer DepDel15;
  public Integer get_DepDel15() {
    return DepDel15;
  }
  public void set_DepDel15(Integer DepDel15) {
    this.DepDel15 = DepDel15;
  }
  public On_Time_On_Time_Performance_2016_1 with_DepDel15(Integer DepDel15) {
    this.DepDel15 = DepDel15;
    return this;
  }
  private java.math.BigDecimal DepDelay;
  public java.math.BigDecimal get_DepDelay() {
    return DepDelay;
  }
  public void set_DepDelay(java.math.BigDecimal DepDelay) {
    this.DepDelay = DepDelay;
  }
  public On_Time_On_Time_Performance_2016_1 with_DepDelay(java.math.BigDecimal DepDelay) {
    this.DepDelay = DepDelay;
    return this;
  }
  private Float DepDelayMinutes;
  public Float get_DepDelayMinutes() {
    return DepDelayMinutes;
  }
  public void set_DepDelayMinutes(Float DepDelayMinutes) {
    this.DepDelayMinutes = DepDelayMinutes;
  }
  public On_Time_On_Time_Performance_2016_1 with_DepDelayMinutes(Float DepDelayMinutes) {
    this.DepDelayMinutes = DepDelayMinutes;
    return this;
  }
  private Integer DepTime;
  public Integer get_DepTime() {
    return DepTime;
  }
  public void set_DepTime(Integer DepTime) {
    this.DepTime = DepTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_DepTime(Integer DepTime) {
    this.DepTime = DepTime;
    return this;
  }
  private String DepTimeBlk;
  public String get_DepTimeBlk() {
    return DepTimeBlk;
  }
  public void set_DepTimeBlk(String DepTimeBlk) {
    this.DepTimeBlk = DepTimeBlk;
  }
  public On_Time_On_Time_Performance_2016_1 with_DepTimeBlk(String DepTimeBlk) {
    this.DepTimeBlk = DepTimeBlk;
    return this;
  }
  private String Dest;
  public String get_Dest() {
    return Dest;
  }
  public void set_Dest(String Dest) {
    this.Dest = Dest;
  }
  public On_Time_On_Time_Performance_2016_1 with_Dest(String Dest) {
    this.Dest = Dest;
    return this;
  }
  private Integer DestAirportID;
  public Integer get_DestAirportID() {
    return DestAirportID;
  }
  public void set_DestAirportID(Integer DestAirportID) {
    this.DestAirportID = DestAirportID;
  }
  public On_Time_On_Time_Performance_2016_1 with_DestAirportID(Integer DestAirportID) {
    this.DestAirportID = DestAirportID;
    return this;
  }
  private Integer DestAirportSeqID;
  public Integer get_DestAirportSeqID() {
    return DestAirportSeqID;
  }
  public void set_DestAirportSeqID(Integer DestAirportSeqID) {
    this.DestAirportSeqID = DestAirportSeqID;
  }
  public On_Time_On_Time_Performance_2016_1 with_DestAirportSeqID(Integer DestAirportSeqID) {
    this.DestAirportSeqID = DestAirportSeqID;
    return this;
  }
  private Integer DestCityMarketID;
  public Integer get_DestCityMarketID() {
    return DestCityMarketID;
  }
  public void set_DestCityMarketID(Integer DestCityMarketID) {
    this.DestCityMarketID = DestCityMarketID;
  }
  public On_Time_On_Time_Performance_2016_1 with_DestCityMarketID(Integer DestCityMarketID) {
    this.DestCityMarketID = DestCityMarketID;
    return this;
  }
  private String DestCityName;
  public String get_DestCityName() {
    return DestCityName;
  }
  public void set_DestCityName(String DestCityName) {
    this.DestCityName = DestCityName;
  }
  public On_Time_On_Time_Performance_2016_1 with_DestCityName(String DestCityName) {
    this.DestCityName = DestCityName;
    return this;
  }
  private String DestState;
  public String get_DestState() {
    return DestState;
  }
  public void set_DestState(String DestState) {
    this.DestState = DestState;
  }
  public On_Time_On_Time_Performance_2016_1 with_DestState(String DestState) {
    this.DestState = DestState;
    return this;
  }
  private Integer DestStateFips;
  public Integer get_DestStateFips() {
    return DestStateFips;
  }
  public void set_DestStateFips(Integer DestStateFips) {
    this.DestStateFips = DestStateFips;
  }
  public On_Time_On_Time_Performance_2016_1 with_DestStateFips(Integer DestStateFips) {
    this.DestStateFips = DestStateFips;
    return this;
  }
  private String DestStateName;
  public String get_DestStateName() {
    return DestStateName;
  }
  public void set_DestStateName(String DestStateName) {
    this.DestStateName = DestStateName;
  }
  public On_Time_On_Time_Performance_2016_1 with_DestStateName(String DestStateName) {
    this.DestStateName = DestStateName;
    return this;
  }
  private Integer DestWac;
  public Integer get_DestWac() {
    return DestWac;
  }
  public void set_DestWac(Integer DestWac) {
    this.DestWac = DestWac;
  }
  public On_Time_On_Time_Performance_2016_1 with_DestWac(Integer DestWac) {
    this.DestWac = DestWac;
    return this;
  }
  private Float Distance;
  public Float get_Distance() {
    return Distance;
  }
  public void set_Distance(Float Distance) {
    this.Distance = Distance;
  }
  public On_Time_On_Time_Performance_2016_1 with_Distance(Float Distance) {
    this.Distance = Distance;
    return this;
  }
  private Integer DistanceGroup;
  public Integer get_DistanceGroup() {
    return DistanceGroup;
  }
  public void set_DistanceGroup(Integer DistanceGroup) {
    this.DistanceGroup = DistanceGroup;
  }
  public On_Time_On_Time_Performance_2016_1 with_DistanceGroup(Integer DistanceGroup) {
    this.DistanceGroup = DistanceGroup;
    return this;
  }
  private String Div1Airport;
  public String get_Div1Airport() {
    return Div1Airport;
  }
  public void set_Div1Airport(String Div1Airport) {
    this.Div1Airport = Div1Airport;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div1Airport(String Div1Airport) {
    this.Div1Airport = Div1Airport;
    return this;
  }
  private Integer Div1AirportID;
  public Integer get_Div1AirportID() {
    return Div1AirportID;
  }
  public void set_Div1AirportID(Integer Div1AirportID) {
    this.Div1AirportID = Div1AirportID;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div1AirportID(Integer Div1AirportID) {
    this.Div1AirportID = Div1AirportID;
    return this;
  }
  private Integer Div1AirportSeqID;
  public Integer get_Div1AirportSeqID() {
    return Div1AirportSeqID;
  }
  public void set_Div1AirportSeqID(Integer Div1AirportSeqID) {
    this.Div1AirportSeqID = Div1AirportSeqID;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div1AirportSeqID(Integer Div1AirportSeqID) {
    this.Div1AirportSeqID = Div1AirportSeqID;
    return this;
  }
  private java.math.BigDecimal Div1LongestGTime;
  public java.math.BigDecimal get_Div1LongestGTime() {
    return Div1LongestGTime;
  }
  public void set_Div1LongestGTime(java.math.BigDecimal Div1LongestGTime) {
    this.Div1LongestGTime = Div1LongestGTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div1LongestGTime(java.math.BigDecimal Div1LongestGTime) {
    this.Div1LongestGTime = Div1LongestGTime;
    return this;
  }
  private String Div1TailNum;
  public String get_Div1TailNum() {
    return Div1TailNum;
  }
  public void set_Div1TailNum(String Div1TailNum) {
    this.Div1TailNum = Div1TailNum;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div1TailNum(String Div1TailNum) {
    this.Div1TailNum = Div1TailNum;
    return this;
  }
  private java.math.BigDecimal Div1TotalGTime;
  public java.math.BigDecimal get_Div1TotalGTime() {
    return Div1TotalGTime;
  }
  public void set_Div1TotalGTime(java.math.BigDecimal Div1TotalGTime) {
    this.Div1TotalGTime = Div1TotalGTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div1TotalGTime(java.math.BigDecimal Div1TotalGTime) {
    this.Div1TotalGTime = Div1TotalGTime;
    return this;
  }
  private java.math.BigDecimal Div1WheelsOff;
  public java.math.BigDecimal get_Div1WheelsOff() {
    return Div1WheelsOff;
  }
  public void set_Div1WheelsOff(java.math.BigDecimal Div1WheelsOff) {
    this.Div1WheelsOff = Div1WheelsOff;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div1WheelsOff(java.math.BigDecimal Div1WheelsOff) {
    this.Div1WheelsOff = Div1WheelsOff;
    return this;
  }
  private java.math.BigDecimal Div1WheelsOn;
  public java.math.BigDecimal get_Div1WheelsOn() {
    return Div1WheelsOn;
  }
  public void set_Div1WheelsOn(java.math.BigDecimal Div1WheelsOn) {
    this.Div1WheelsOn = Div1WheelsOn;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div1WheelsOn(java.math.BigDecimal Div1WheelsOn) {
    this.Div1WheelsOn = Div1WheelsOn;
    return this;
  }
  private String Div2Airport;
  public String get_Div2Airport() {
    return Div2Airport;
  }
  public void set_Div2Airport(String Div2Airport) {
    this.Div2Airport = Div2Airport;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div2Airport(String Div2Airport) {
    this.Div2Airport = Div2Airport;
    return this;
  }
  private Integer Div2AirportID;
  public Integer get_Div2AirportID() {
    return Div2AirportID;
  }
  public void set_Div2AirportID(Integer Div2AirportID) {
    this.Div2AirportID = Div2AirportID;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div2AirportID(Integer Div2AirportID) {
    this.Div2AirportID = Div2AirportID;
    return this;
  }
  private Integer Div2AirportSeqID;
  public Integer get_Div2AirportSeqID() {
    return Div2AirportSeqID;
  }
  public void set_Div2AirportSeqID(Integer Div2AirportSeqID) {
    this.Div2AirportSeqID = Div2AirportSeqID;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div2AirportSeqID(Integer Div2AirportSeqID) {
    this.Div2AirportSeqID = Div2AirportSeqID;
    return this;
  }
  private java.math.BigDecimal Div2LongestGTime;
  public java.math.BigDecimal get_Div2LongestGTime() {
    return Div2LongestGTime;
  }
  public void set_Div2LongestGTime(java.math.BigDecimal Div2LongestGTime) {
    this.Div2LongestGTime = Div2LongestGTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div2LongestGTime(java.math.BigDecimal Div2LongestGTime) {
    this.Div2LongestGTime = Div2LongestGTime;
    return this;
  }
  private java.math.BigDecimal Div2TotalGTime;
  public java.math.BigDecimal get_Div2TotalGTime() {
    return Div2TotalGTime;
  }
  public void set_Div2TotalGTime(java.math.BigDecimal Div2TotalGTime) {
    this.Div2TotalGTime = Div2TotalGTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div2TotalGTime(java.math.BigDecimal Div2TotalGTime) {
    this.Div2TotalGTime = Div2TotalGTime;
    return this;
  }
  private java.math.BigDecimal Div2WheelsOn;
  public java.math.BigDecimal get_Div2WheelsOn() {
    return Div2WheelsOn;
  }
  public void set_Div2WheelsOn(java.math.BigDecimal Div2WheelsOn) {
    this.Div2WheelsOn = Div2WheelsOn;
  }
  public On_Time_On_Time_Performance_2016_1 with_Div2WheelsOn(java.math.BigDecimal Div2WheelsOn) {
    this.Div2WheelsOn = Div2WheelsOn;
    return this;
  }
  private java.math.BigDecimal DivActualElapsedTime;
  public java.math.BigDecimal get_DivActualElapsedTime() {
    return DivActualElapsedTime;
  }
  public void set_DivActualElapsedTime(java.math.BigDecimal DivActualElapsedTime) {
    this.DivActualElapsedTime = DivActualElapsedTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_DivActualElapsedTime(java.math.BigDecimal DivActualElapsedTime) {
    this.DivActualElapsedTime = DivActualElapsedTime;
    return this;
  }
  private Integer DivAirportLandings;
  public Integer get_DivAirportLandings() {
    return DivAirportLandings;
  }
  public void set_DivAirportLandings(Integer DivAirportLandings) {
    this.DivAirportLandings = DivAirportLandings;
  }
  public On_Time_On_Time_Performance_2016_1 with_DivAirportLandings(Integer DivAirportLandings) {
    this.DivAirportLandings = DivAirportLandings;
    return this;
  }
  private java.math.BigDecimal DivArrDelay;
  public java.math.BigDecimal get_DivArrDelay() {
    return DivArrDelay;
  }
  public void set_DivArrDelay(java.math.BigDecimal DivArrDelay) {
    this.DivArrDelay = DivArrDelay;
  }
  public On_Time_On_Time_Performance_2016_1 with_DivArrDelay(java.math.BigDecimal DivArrDelay) {
    this.DivArrDelay = DivArrDelay;
    return this;
  }
  private java.math.BigDecimal DivDistance;
  public java.math.BigDecimal get_DivDistance() {
    return DivDistance;
  }
  public void set_DivDistance(java.math.BigDecimal DivDistance) {
    this.DivDistance = DivDistance;
  }
  public On_Time_On_Time_Performance_2016_1 with_DivDistance(java.math.BigDecimal DivDistance) {
    this.DivDistance = DivDistance;
    return this;
  }
  private Integer Diverted;
  public Integer get_Diverted() {
    return Diverted;
  }
  public void set_Diverted(Integer Diverted) {
    this.Diverted = Diverted;
  }
  public On_Time_On_Time_Performance_2016_1 with_Diverted(Integer Diverted) {
    this.Diverted = Diverted;
    return this;
  }
  private java.math.BigDecimal DivReachedDest;
  public java.math.BigDecimal get_DivReachedDest() {
    return DivReachedDest;
  }
  public void set_DivReachedDest(java.math.BigDecimal DivReachedDest) {
    this.DivReachedDest = DivReachedDest;
  }
  public On_Time_On_Time_Performance_2016_1 with_DivReachedDest(java.math.BigDecimal DivReachedDest) {
    this.DivReachedDest = DivReachedDest;
    return this;
  }
  private java.math.BigDecimal FirstDepTime;
  public java.math.BigDecimal get_FirstDepTime() {
    return FirstDepTime;
  }
  public void set_FirstDepTime(java.math.BigDecimal FirstDepTime) {
    this.FirstDepTime = FirstDepTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_FirstDepTime(java.math.BigDecimal FirstDepTime) {
    this.FirstDepTime = FirstDepTime;
    return this;
  }
  private java.sql.Date FlightDate;
  public java.sql.Date get_FlightDate() {
    return FlightDate;
  }
  public void set_FlightDate(java.sql.Date FlightDate) {
    this.FlightDate = FlightDate;
  }
  public On_Time_On_Time_Performance_2016_1 with_FlightDate(java.sql.Date FlightDate) {
    this.FlightDate = FlightDate;
    return this;
  }
  private Integer FlightNum;
  public Integer get_FlightNum() {
    return FlightNum;
  }
  public void set_FlightNum(Integer FlightNum) {
    this.FlightNum = FlightNum;
  }
  public On_Time_On_Time_Performance_2016_1 with_FlightNum(Integer FlightNum) {
    this.FlightNum = FlightNum;
    return this;
  }
  private Float Flights;
  public Float get_Flights() {
    return Flights;
  }
  public void set_Flights(Float Flights) {
    this.Flights = Flights;
  }
  public On_Time_On_Time_Performance_2016_1 with_Flights(Float Flights) {
    this.Flights = Flights;
    return this;
  }
  private java.math.BigDecimal LateAircraftDelay;
  public java.math.BigDecimal get_LateAircraftDelay() {
    return LateAircraftDelay;
  }
  public void set_LateAircraftDelay(java.math.BigDecimal LateAircraftDelay) {
    this.LateAircraftDelay = LateAircraftDelay;
  }
  public On_Time_On_Time_Performance_2016_1 with_LateAircraftDelay(java.math.BigDecimal LateAircraftDelay) {
    this.LateAircraftDelay = LateAircraftDelay;
    return this;
  }
  private java.math.BigDecimal LongestAddGTime;
  public java.math.BigDecimal get_LongestAddGTime() {
    return LongestAddGTime;
  }
  public void set_LongestAddGTime(java.math.BigDecimal LongestAddGTime) {
    this.LongestAddGTime = LongestAddGTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_LongestAddGTime(java.math.BigDecimal LongestAddGTime) {
    this.LongestAddGTime = LongestAddGTime;
    return this;
  }
  private Integer Month;
  public Integer get_Month() {
    return Month;
  }
  public void set_Month(Integer Month) {
    this.Month = Month;
  }
  public On_Time_On_Time_Performance_2016_1 with_Month(Integer Month) {
    this.Month = Month;
    return this;
  }
  private java.math.BigDecimal NASDelay;
  public java.math.BigDecimal get_NASDelay() {
    return NASDelay;
  }
  public void set_NASDelay(java.math.BigDecimal NASDelay) {
    this.NASDelay = NASDelay;
  }
  public On_Time_On_Time_Performance_2016_1 with_NASDelay(java.math.BigDecimal NASDelay) {
    this.NASDelay = NASDelay;
    return this;
  }
  private String Origin;
  public String get_Origin() {
    return Origin;
  }
  public void set_Origin(String Origin) {
    this.Origin = Origin;
  }
  public On_Time_On_Time_Performance_2016_1 with_Origin(String Origin) {
    this.Origin = Origin;
    return this;
  }
  private Integer OriginAirportID;
  public Integer get_OriginAirportID() {
    return OriginAirportID;
  }
  public void set_OriginAirportID(Integer OriginAirportID) {
    this.OriginAirportID = OriginAirportID;
  }
  public On_Time_On_Time_Performance_2016_1 with_OriginAirportID(Integer OriginAirportID) {
    this.OriginAirportID = OriginAirportID;
    return this;
  }
  private Integer OriginAirportSeqID;
  public Integer get_OriginAirportSeqID() {
    return OriginAirportSeqID;
  }
  public void set_OriginAirportSeqID(Integer OriginAirportSeqID) {
    this.OriginAirportSeqID = OriginAirportSeqID;
  }
  public On_Time_On_Time_Performance_2016_1 with_OriginAirportSeqID(Integer OriginAirportSeqID) {
    this.OriginAirportSeqID = OriginAirportSeqID;
    return this;
  }
  private Integer OriginCityMarketID;
  public Integer get_OriginCityMarketID() {
    return OriginCityMarketID;
  }
  public void set_OriginCityMarketID(Integer OriginCityMarketID) {
    this.OriginCityMarketID = OriginCityMarketID;
  }
  public On_Time_On_Time_Performance_2016_1 with_OriginCityMarketID(Integer OriginCityMarketID) {
    this.OriginCityMarketID = OriginCityMarketID;
    return this;
  }
  private String OriginCityName;
  public String get_OriginCityName() {
    return OriginCityName;
  }
  public void set_OriginCityName(String OriginCityName) {
    this.OriginCityName = OriginCityName;
  }
  public On_Time_On_Time_Performance_2016_1 with_OriginCityName(String OriginCityName) {
    this.OriginCityName = OriginCityName;
    return this;
  }
  private String OriginState;
  public String get_OriginState() {
    return OriginState;
  }
  public void set_OriginState(String OriginState) {
    this.OriginState = OriginState;
  }
  public On_Time_On_Time_Performance_2016_1 with_OriginState(String OriginState) {
    this.OriginState = OriginState;
    return this;
  }
  private Integer OriginStateFips;
  public Integer get_OriginStateFips() {
    return OriginStateFips;
  }
  public void set_OriginStateFips(Integer OriginStateFips) {
    this.OriginStateFips = OriginStateFips;
  }
  public On_Time_On_Time_Performance_2016_1 with_OriginStateFips(Integer OriginStateFips) {
    this.OriginStateFips = OriginStateFips;
    return this;
  }
  private String OriginStateName;
  public String get_OriginStateName() {
    return OriginStateName;
  }
  public void set_OriginStateName(String OriginStateName) {
    this.OriginStateName = OriginStateName;
  }
  public On_Time_On_Time_Performance_2016_1 with_OriginStateName(String OriginStateName) {
    this.OriginStateName = OriginStateName;
    return this;
  }
  private Integer OriginWac;
  public Integer get_OriginWac() {
    return OriginWac;
  }
  public void set_OriginWac(Integer OriginWac) {
    this.OriginWac = OriginWac;
  }
  public On_Time_On_Time_Performance_2016_1 with_OriginWac(Integer OriginWac) {
    this.OriginWac = OriginWac;
    return this;
  }
  private Integer Quarter;
  public Integer get_Quarter() {
    return Quarter;
  }
  public void set_Quarter(Integer Quarter) {
    this.Quarter = Quarter;
  }
  public On_Time_On_Time_Performance_2016_1 with_Quarter(Integer Quarter) {
    this.Quarter = Quarter;
    return this;
  }
  private java.math.BigDecimal SecurityDelay;
  public java.math.BigDecimal get_SecurityDelay() {
    return SecurityDelay;
  }
  public void set_SecurityDelay(java.math.BigDecimal SecurityDelay) {
    this.SecurityDelay = SecurityDelay;
  }
  public On_Time_On_Time_Performance_2016_1 with_SecurityDelay(java.math.BigDecimal SecurityDelay) {
    this.SecurityDelay = SecurityDelay;
    return this;
  }
  private String TailNum;
  public String get_TailNum() {
    return TailNum;
  }
  public void set_TailNum(String TailNum) {
    this.TailNum = TailNum;
  }
  public On_Time_On_Time_Performance_2016_1 with_TailNum(String TailNum) {
    this.TailNum = TailNum;
    return this;
  }
  private Float TaxiIn;
  public Float get_TaxiIn() {
    return TaxiIn;
  }
  public void set_TaxiIn(Float TaxiIn) {
    this.TaxiIn = TaxiIn;
  }
  public On_Time_On_Time_Performance_2016_1 with_TaxiIn(Float TaxiIn) {
    this.TaxiIn = TaxiIn;
    return this;
  }
  private Float TaxiOut;
  public Float get_TaxiOut() {
    return TaxiOut;
  }
  public void set_TaxiOut(Float TaxiOut) {
    this.TaxiOut = TaxiOut;
  }
  public On_Time_On_Time_Performance_2016_1 with_TaxiOut(Float TaxiOut) {
    this.TaxiOut = TaxiOut;
    return this;
  }
  private java.math.BigDecimal TotalAddGTime;
  public java.math.BigDecimal get_TotalAddGTime() {
    return TotalAddGTime;
  }
  public void set_TotalAddGTime(java.math.BigDecimal TotalAddGTime) {
    this.TotalAddGTime = TotalAddGTime;
  }
  public On_Time_On_Time_Performance_2016_1 with_TotalAddGTime(java.math.BigDecimal TotalAddGTime) {
    this.TotalAddGTime = TotalAddGTime;
    return this;
  }
  private String UniqueCarrier;
  public String get_UniqueCarrier() {
    return UniqueCarrier;
  }
  public void set_UniqueCarrier(String UniqueCarrier) {
    this.UniqueCarrier = UniqueCarrier;
  }
  public On_Time_On_Time_Performance_2016_1 with_UniqueCarrier(String UniqueCarrier) {
    this.UniqueCarrier = UniqueCarrier;
    return this;
  }
  private java.math.BigDecimal WeatherDelay;
  public java.math.BigDecimal get_WeatherDelay() {
    return WeatherDelay;
  }
  public void set_WeatherDelay(java.math.BigDecimal WeatherDelay) {
    this.WeatherDelay = WeatherDelay;
  }
  public On_Time_On_Time_Performance_2016_1 with_WeatherDelay(java.math.BigDecimal WeatherDelay) {
    this.WeatherDelay = WeatherDelay;
    return this;
  }
  private Integer WheelsOff;
  public Integer get_WheelsOff() {
    return WheelsOff;
  }
  public void set_WheelsOff(Integer WheelsOff) {
    this.WheelsOff = WheelsOff;
  }
  public On_Time_On_Time_Performance_2016_1 with_WheelsOff(Integer WheelsOff) {
    this.WheelsOff = WheelsOff;
    return this;
  }
  private Integer WheelsOn;
  public Integer get_WheelsOn() {
    return WheelsOn;
  }
  public void set_WheelsOn(Integer WheelsOn) {
    this.WheelsOn = WheelsOn;
  }
  public On_Time_On_Time_Performance_2016_1 with_WheelsOn(Integer WheelsOn) {
    this.WheelsOn = WheelsOn;
    return this;
  }
  private Integer Year;
  public Integer get_Year() {
    return Year;
  }
  public void set_Year(Integer Year) {
    this.Year = Year;
  }
  public On_Time_On_Time_Performance_2016_1 with_Year(Integer Year) {
    this.Year = Year;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof On_Time_On_Time_Performance_2016_1)) {
      return false;
    }
    On_Time_On_Time_Performance_2016_1 that = (On_Time_On_Time_Performance_2016_1) o;
    boolean equal = true;
    equal = equal && (this.ActualElapsedTime == null ? that.ActualElapsedTime == null : this.ActualElapsedTime.equals(that.ActualElapsedTime));
    equal = equal && (this.AirlineID == null ? that.AirlineID == null : this.AirlineID.equals(that.AirlineID));
    equal = equal && (this.AirTime == null ? that.AirTime == null : this.AirTime.equals(that.AirTime));
    equal = equal && (this.ArrDel15 == null ? that.ArrDel15 == null : this.ArrDel15.equals(that.ArrDel15));
    equal = equal && (this.ArrDelay == null ? that.ArrDelay == null : this.ArrDelay.equals(that.ArrDelay));
    equal = equal && (this.ArrDelayMinutes == null ? that.ArrDelayMinutes == null : this.ArrDelayMinutes.equals(that.ArrDelayMinutes));
    equal = equal && (this.ArrivalDelayGroups == null ? that.ArrivalDelayGroups == null : this.ArrivalDelayGroups.equals(that.ArrivalDelayGroups));
    equal = equal && (this.ArrTime == null ? that.ArrTime == null : this.ArrTime.equals(that.ArrTime));
    equal = equal && (this.ArrTimeBlk == null ? that.ArrTimeBlk == null : this.ArrTimeBlk.equals(that.ArrTimeBlk));
    equal = equal && (this.CancellationCode == null ? that.CancellationCode == null : this.CancellationCode.equals(that.CancellationCode));
    equal = equal && (this.Cancelled == null ? that.Cancelled == null : this.Cancelled.equals(that.Cancelled));
    equal = equal && (this.Carrier == null ? that.Carrier == null : this.Carrier.equals(that.Carrier));
    equal = equal && (this.CarrierDelay == null ? that.CarrierDelay == null : this.CarrierDelay.equals(that.CarrierDelay));
    equal = equal && (this.CRSArrTime == null ? that.CRSArrTime == null : this.CRSArrTime.equals(that.CRSArrTime));
    equal = equal && (this.CRSDepTime == null ? that.CRSDepTime == null : this.CRSDepTime.equals(that.CRSDepTime));
    equal = equal && (this.CRSElapsedTime == null ? that.CRSElapsedTime == null : this.CRSElapsedTime.equals(that.CRSElapsedTime));
    equal = equal && (this.DayofMonth == null ? that.DayofMonth == null : this.DayofMonth.equals(that.DayofMonth));
    equal = equal && (this.DayOfWeek == null ? that.DayOfWeek == null : this.DayOfWeek.equals(that.DayOfWeek));
    equal = equal && (this.DepartureDelayGroups == null ? that.DepartureDelayGroups == null : this.DepartureDelayGroups.equals(that.DepartureDelayGroups));
    equal = equal && (this.DepDel15 == null ? that.DepDel15 == null : this.DepDel15.equals(that.DepDel15));
    equal = equal && (this.DepDelay == null ? that.DepDelay == null : this.DepDelay.equals(that.DepDelay));
    equal = equal && (this.DepDelayMinutes == null ? that.DepDelayMinutes == null : this.DepDelayMinutes.equals(that.DepDelayMinutes));
    equal = equal && (this.DepTime == null ? that.DepTime == null : this.DepTime.equals(that.DepTime));
    equal = equal && (this.DepTimeBlk == null ? that.DepTimeBlk == null : this.DepTimeBlk.equals(that.DepTimeBlk));
    equal = equal && (this.Dest == null ? that.Dest == null : this.Dest.equals(that.Dest));
    equal = equal && (this.DestAirportID == null ? that.DestAirportID == null : this.DestAirportID.equals(that.DestAirportID));
    equal = equal && (this.DestAirportSeqID == null ? that.DestAirportSeqID == null : this.DestAirportSeqID.equals(that.DestAirportSeqID));
    equal = equal && (this.DestCityMarketID == null ? that.DestCityMarketID == null : this.DestCityMarketID.equals(that.DestCityMarketID));
    equal = equal && (this.DestCityName == null ? that.DestCityName == null : this.DestCityName.equals(that.DestCityName));
    equal = equal && (this.DestState == null ? that.DestState == null : this.DestState.equals(that.DestState));
    equal = equal && (this.DestStateFips == null ? that.DestStateFips == null : this.DestStateFips.equals(that.DestStateFips));
    equal = equal && (this.DestStateName == null ? that.DestStateName == null : this.DestStateName.equals(that.DestStateName));
    equal = equal && (this.DestWac == null ? that.DestWac == null : this.DestWac.equals(that.DestWac));
    equal = equal && (this.Distance == null ? that.Distance == null : this.Distance.equals(that.Distance));
    equal = equal && (this.DistanceGroup == null ? that.DistanceGroup == null : this.DistanceGroup.equals(that.DistanceGroup));
    equal = equal && (this.Div1Airport == null ? that.Div1Airport == null : this.Div1Airport.equals(that.Div1Airport));
    equal = equal && (this.Div1AirportID == null ? that.Div1AirportID == null : this.Div1AirportID.equals(that.Div1AirportID));
    equal = equal && (this.Div1AirportSeqID == null ? that.Div1AirportSeqID == null : this.Div1AirportSeqID.equals(that.Div1AirportSeqID));
    equal = equal && (this.Div1LongestGTime == null ? that.Div1LongestGTime == null : this.Div1LongestGTime.equals(that.Div1LongestGTime));
    equal = equal && (this.Div1TailNum == null ? that.Div1TailNum == null : this.Div1TailNum.equals(that.Div1TailNum));
    equal = equal && (this.Div1TotalGTime == null ? that.Div1TotalGTime == null : this.Div1TotalGTime.equals(that.Div1TotalGTime));
    equal = equal && (this.Div1WheelsOff == null ? that.Div1WheelsOff == null : this.Div1WheelsOff.equals(that.Div1WheelsOff));
    equal = equal && (this.Div1WheelsOn == null ? that.Div1WheelsOn == null : this.Div1WheelsOn.equals(that.Div1WheelsOn));
    equal = equal && (this.Div2Airport == null ? that.Div2Airport == null : this.Div2Airport.equals(that.Div2Airport));
    equal = equal && (this.Div2AirportID == null ? that.Div2AirportID == null : this.Div2AirportID.equals(that.Div2AirportID));
    equal = equal && (this.Div2AirportSeqID == null ? that.Div2AirportSeqID == null : this.Div2AirportSeqID.equals(that.Div2AirportSeqID));
    equal = equal && (this.Div2LongestGTime == null ? that.Div2LongestGTime == null : this.Div2LongestGTime.equals(that.Div2LongestGTime));
    equal = equal && (this.Div2TotalGTime == null ? that.Div2TotalGTime == null : this.Div2TotalGTime.equals(that.Div2TotalGTime));
    equal = equal && (this.Div2WheelsOn == null ? that.Div2WheelsOn == null : this.Div2WheelsOn.equals(that.Div2WheelsOn));
    equal = equal && (this.DivActualElapsedTime == null ? that.DivActualElapsedTime == null : this.DivActualElapsedTime.equals(that.DivActualElapsedTime));
    equal = equal && (this.DivAirportLandings == null ? that.DivAirportLandings == null : this.DivAirportLandings.equals(that.DivAirportLandings));
    equal = equal && (this.DivArrDelay == null ? that.DivArrDelay == null : this.DivArrDelay.equals(that.DivArrDelay));
    equal = equal && (this.DivDistance == null ? that.DivDistance == null : this.DivDistance.equals(that.DivDistance));
    equal = equal && (this.Diverted == null ? that.Diverted == null : this.Diverted.equals(that.Diverted));
    equal = equal && (this.DivReachedDest == null ? that.DivReachedDest == null : this.DivReachedDest.equals(that.DivReachedDest));
    equal = equal && (this.FirstDepTime == null ? that.FirstDepTime == null : this.FirstDepTime.equals(that.FirstDepTime));
    equal = equal && (this.FlightDate == null ? that.FlightDate == null : this.FlightDate.equals(that.FlightDate));
    equal = equal && (this.FlightNum == null ? that.FlightNum == null : this.FlightNum.equals(that.FlightNum));
    equal = equal && (this.Flights == null ? that.Flights == null : this.Flights.equals(that.Flights));
    equal = equal && (this.LateAircraftDelay == null ? that.LateAircraftDelay == null : this.LateAircraftDelay.equals(that.LateAircraftDelay));
    equal = equal && (this.LongestAddGTime == null ? that.LongestAddGTime == null : this.LongestAddGTime.equals(that.LongestAddGTime));
    equal = equal && (this.Month == null ? that.Month == null : this.Month.equals(that.Month));
    equal = equal && (this.NASDelay == null ? that.NASDelay == null : this.NASDelay.equals(that.NASDelay));
    equal = equal && (this.Origin == null ? that.Origin == null : this.Origin.equals(that.Origin));
    equal = equal && (this.OriginAirportID == null ? that.OriginAirportID == null : this.OriginAirportID.equals(that.OriginAirportID));
    equal = equal && (this.OriginAirportSeqID == null ? that.OriginAirportSeqID == null : this.OriginAirportSeqID.equals(that.OriginAirportSeqID));
    equal = equal && (this.OriginCityMarketID == null ? that.OriginCityMarketID == null : this.OriginCityMarketID.equals(that.OriginCityMarketID));
    equal = equal && (this.OriginCityName == null ? that.OriginCityName == null : this.OriginCityName.equals(that.OriginCityName));
    equal = equal && (this.OriginState == null ? that.OriginState == null : this.OriginState.equals(that.OriginState));
    equal = equal && (this.OriginStateFips == null ? that.OriginStateFips == null : this.OriginStateFips.equals(that.OriginStateFips));
    equal = equal && (this.OriginStateName == null ? that.OriginStateName == null : this.OriginStateName.equals(that.OriginStateName));
    equal = equal && (this.OriginWac == null ? that.OriginWac == null : this.OriginWac.equals(that.OriginWac));
    equal = equal && (this.Quarter == null ? that.Quarter == null : this.Quarter.equals(that.Quarter));
    equal = equal && (this.SecurityDelay == null ? that.SecurityDelay == null : this.SecurityDelay.equals(that.SecurityDelay));
    equal = equal && (this.TailNum == null ? that.TailNum == null : this.TailNum.equals(that.TailNum));
    equal = equal && (this.TaxiIn == null ? that.TaxiIn == null : this.TaxiIn.equals(that.TaxiIn));
    equal = equal && (this.TaxiOut == null ? that.TaxiOut == null : this.TaxiOut.equals(that.TaxiOut));
    equal = equal && (this.TotalAddGTime == null ? that.TotalAddGTime == null : this.TotalAddGTime.equals(that.TotalAddGTime));
    equal = equal && (this.UniqueCarrier == null ? that.UniqueCarrier == null : this.UniqueCarrier.equals(that.UniqueCarrier));
    equal = equal && (this.WeatherDelay == null ? that.WeatherDelay == null : this.WeatherDelay.equals(that.WeatherDelay));
    equal = equal && (this.WheelsOff == null ? that.WheelsOff == null : this.WheelsOff.equals(that.WheelsOff));
    equal = equal && (this.WheelsOn == null ? that.WheelsOn == null : this.WheelsOn.equals(that.WheelsOn));
    equal = equal && (this.Year == null ? that.Year == null : this.Year.equals(that.Year));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof On_Time_On_Time_Performance_2016_1)) {
      return false;
    }
    On_Time_On_Time_Performance_2016_1 that = (On_Time_On_Time_Performance_2016_1) o;
    boolean equal = true;
    equal = equal && (this.ActualElapsedTime == null ? that.ActualElapsedTime == null : this.ActualElapsedTime.equals(that.ActualElapsedTime));
    equal = equal && (this.AirlineID == null ? that.AirlineID == null : this.AirlineID.equals(that.AirlineID));
    equal = equal && (this.AirTime == null ? that.AirTime == null : this.AirTime.equals(that.AirTime));
    equal = equal && (this.ArrDel15 == null ? that.ArrDel15 == null : this.ArrDel15.equals(that.ArrDel15));
    equal = equal && (this.ArrDelay == null ? that.ArrDelay == null : this.ArrDelay.equals(that.ArrDelay));
    equal = equal && (this.ArrDelayMinutes == null ? that.ArrDelayMinutes == null : this.ArrDelayMinutes.equals(that.ArrDelayMinutes));
    equal = equal && (this.ArrivalDelayGroups == null ? that.ArrivalDelayGroups == null : this.ArrivalDelayGroups.equals(that.ArrivalDelayGroups));
    equal = equal && (this.ArrTime == null ? that.ArrTime == null : this.ArrTime.equals(that.ArrTime));
    equal = equal && (this.ArrTimeBlk == null ? that.ArrTimeBlk == null : this.ArrTimeBlk.equals(that.ArrTimeBlk));
    equal = equal && (this.CancellationCode == null ? that.CancellationCode == null : this.CancellationCode.equals(that.CancellationCode));
    equal = equal && (this.Cancelled == null ? that.Cancelled == null : this.Cancelled.equals(that.Cancelled));
    equal = equal && (this.Carrier == null ? that.Carrier == null : this.Carrier.equals(that.Carrier));
    equal = equal && (this.CarrierDelay == null ? that.CarrierDelay == null : this.CarrierDelay.equals(that.CarrierDelay));
    equal = equal && (this.CRSArrTime == null ? that.CRSArrTime == null : this.CRSArrTime.equals(that.CRSArrTime));
    equal = equal && (this.CRSDepTime == null ? that.CRSDepTime == null : this.CRSDepTime.equals(that.CRSDepTime));
    equal = equal && (this.CRSElapsedTime == null ? that.CRSElapsedTime == null : this.CRSElapsedTime.equals(that.CRSElapsedTime));
    equal = equal && (this.DayofMonth == null ? that.DayofMonth == null : this.DayofMonth.equals(that.DayofMonth));
    equal = equal && (this.DayOfWeek == null ? that.DayOfWeek == null : this.DayOfWeek.equals(that.DayOfWeek));
    equal = equal && (this.DepartureDelayGroups == null ? that.DepartureDelayGroups == null : this.DepartureDelayGroups.equals(that.DepartureDelayGroups));
    equal = equal && (this.DepDel15 == null ? that.DepDel15 == null : this.DepDel15.equals(that.DepDel15));
    equal = equal && (this.DepDelay == null ? that.DepDelay == null : this.DepDelay.equals(that.DepDelay));
    equal = equal && (this.DepDelayMinutes == null ? that.DepDelayMinutes == null : this.DepDelayMinutes.equals(that.DepDelayMinutes));
    equal = equal && (this.DepTime == null ? that.DepTime == null : this.DepTime.equals(that.DepTime));
    equal = equal && (this.DepTimeBlk == null ? that.DepTimeBlk == null : this.DepTimeBlk.equals(that.DepTimeBlk));
    equal = equal && (this.Dest == null ? that.Dest == null : this.Dest.equals(that.Dest));
    equal = equal && (this.DestAirportID == null ? that.DestAirportID == null : this.DestAirportID.equals(that.DestAirportID));
    equal = equal && (this.DestAirportSeqID == null ? that.DestAirportSeqID == null : this.DestAirportSeqID.equals(that.DestAirportSeqID));
    equal = equal && (this.DestCityMarketID == null ? that.DestCityMarketID == null : this.DestCityMarketID.equals(that.DestCityMarketID));
    equal = equal && (this.DestCityName == null ? that.DestCityName == null : this.DestCityName.equals(that.DestCityName));
    equal = equal && (this.DestState == null ? that.DestState == null : this.DestState.equals(that.DestState));
    equal = equal && (this.DestStateFips == null ? that.DestStateFips == null : this.DestStateFips.equals(that.DestStateFips));
    equal = equal && (this.DestStateName == null ? that.DestStateName == null : this.DestStateName.equals(that.DestStateName));
    equal = equal && (this.DestWac == null ? that.DestWac == null : this.DestWac.equals(that.DestWac));
    equal = equal && (this.Distance == null ? that.Distance == null : this.Distance.equals(that.Distance));
    equal = equal && (this.DistanceGroup == null ? that.DistanceGroup == null : this.DistanceGroup.equals(that.DistanceGroup));
    equal = equal && (this.Div1Airport == null ? that.Div1Airport == null : this.Div1Airport.equals(that.Div1Airport));
    equal = equal && (this.Div1AirportID == null ? that.Div1AirportID == null : this.Div1AirportID.equals(that.Div1AirportID));
    equal = equal && (this.Div1AirportSeqID == null ? that.Div1AirportSeqID == null : this.Div1AirportSeqID.equals(that.Div1AirportSeqID));
    equal = equal && (this.Div1LongestGTime == null ? that.Div1LongestGTime == null : this.Div1LongestGTime.equals(that.Div1LongestGTime));
    equal = equal && (this.Div1TailNum == null ? that.Div1TailNum == null : this.Div1TailNum.equals(that.Div1TailNum));
    equal = equal && (this.Div1TotalGTime == null ? that.Div1TotalGTime == null : this.Div1TotalGTime.equals(that.Div1TotalGTime));
    equal = equal && (this.Div1WheelsOff == null ? that.Div1WheelsOff == null : this.Div1WheelsOff.equals(that.Div1WheelsOff));
    equal = equal && (this.Div1WheelsOn == null ? that.Div1WheelsOn == null : this.Div1WheelsOn.equals(that.Div1WheelsOn));
    equal = equal && (this.Div2Airport == null ? that.Div2Airport == null : this.Div2Airport.equals(that.Div2Airport));
    equal = equal && (this.Div2AirportID == null ? that.Div2AirportID == null : this.Div2AirportID.equals(that.Div2AirportID));
    equal = equal && (this.Div2AirportSeqID == null ? that.Div2AirportSeqID == null : this.Div2AirportSeqID.equals(that.Div2AirportSeqID));
    equal = equal && (this.Div2LongestGTime == null ? that.Div2LongestGTime == null : this.Div2LongestGTime.equals(that.Div2LongestGTime));
    equal = equal && (this.Div2TotalGTime == null ? that.Div2TotalGTime == null : this.Div2TotalGTime.equals(that.Div2TotalGTime));
    equal = equal && (this.Div2WheelsOn == null ? that.Div2WheelsOn == null : this.Div2WheelsOn.equals(that.Div2WheelsOn));
    equal = equal && (this.DivActualElapsedTime == null ? that.DivActualElapsedTime == null : this.DivActualElapsedTime.equals(that.DivActualElapsedTime));
    equal = equal && (this.DivAirportLandings == null ? that.DivAirportLandings == null : this.DivAirportLandings.equals(that.DivAirportLandings));
    equal = equal && (this.DivArrDelay == null ? that.DivArrDelay == null : this.DivArrDelay.equals(that.DivArrDelay));
    equal = equal && (this.DivDistance == null ? that.DivDistance == null : this.DivDistance.equals(that.DivDistance));
    equal = equal && (this.Diverted == null ? that.Diverted == null : this.Diverted.equals(that.Diverted));
    equal = equal && (this.DivReachedDest == null ? that.DivReachedDest == null : this.DivReachedDest.equals(that.DivReachedDest));
    equal = equal && (this.FirstDepTime == null ? that.FirstDepTime == null : this.FirstDepTime.equals(that.FirstDepTime));
    equal = equal && (this.FlightDate == null ? that.FlightDate == null : this.FlightDate.equals(that.FlightDate));
    equal = equal && (this.FlightNum == null ? that.FlightNum == null : this.FlightNum.equals(that.FlightNum));
    equal = equal && (this.Flights == null ? that.Flights == null : this.Flights.equals(that.Flights));
    equal = equal && (this.LateAircraftDelay == null ? that.LateAircraftDelay == null : this.LateAircraftDelay.equals(that.LateAircraftDelay));
    equal = equal && (this.LongestAddGTime == null ? that.LongestAddGTime == null : this.LongestAddGTime.equals(that.LongestAddGTime));
    equal = equal && (this.Month == null ? that.Month == null : this.Month.equals(that.Month));
    equal = equal && (this.NASDelay == null ? that.NASDelay == null : this.NASDelay.equals(that.NASDelay));
    equal = equal && (this.Origin == null ? that.Origin == null : this.Origin.equals(that.Origin));
    equal = equal && (this.OriginAirportID == null ? that.OriginAirportID == null : this.OriginAirportID.equals(that.OriginAirportID));
    equal = equal && (this.OriginAirportSeqID == null ? that.OriginAirportSeqID == null : this.OriginAirportSeqID.equals(that.OriginAirportSeqID));
    equal = equal && (this.OriginCityMarketID == null ? that.OriginCityMarketID == null : this.OriginCityMarketID.equals(that.OriginCityMarketID));
    equal = equal && (this.OriginCityName == null ? that.OriginCityName == null : this.OriginCityName.equals(that.OriginCityName));
    equal = equal && (this.OriginState == null ? that.OriginState == null : this.OriginState.equals(that.OriginState));
    equal = equal && (this.OriginStateFips == null ? that.OriginStateFips == null : this.OriginStateFips.equals(that.OriginStateFips));
    equal = equal && (this.OriginStateName == null ? that.OriginStateName == null : this.OriginStateName.equals(that.OriginStateName));
    equal = equal && (this.OriginWac == null ? that.OriginWac == null : this.OriginWac.equals(that.OriginWac));
    equal = equal && (this.Quarter == null ? that.Quarter == null : this.Quarter.equals(that.Quarter));
    equal = equal && (this.SecurityDelay == null ? that.SecurityDelay == null : this.SecurityDelay.equals(that.SecurityDelay));
    equal = equal && (this.TailNum == null ? that.TailNum == null : this.TailNum.equals(that.TailNum));
    equal = equal && (this.TaxiIn == null ? that.TaxiIn == null : this.TaxiIn.equals(that.TaxiIn));
    equal = equal && (this.TaxiOut == null ? that.TaxiOut == null : this.TaxiOut.equals(that.TaxiOut));
    equal = equal && (this.TotalAddGTime == null ? that.TotalAddGTime == null : this.TotalAddGTime.equals(that.TotalAddGTime));
    equal = equal && (this.UniqueCarrier == null ? that.UniqueCarrier == null : this.UniqueCarrier.equals(that.UniqueCarrier));
    equal = equal && (this.WeatherDelay == null ? that.WeatherDelay == null : this.WeatherDelay.equals(that.WeatherDelay));
    equal = equal && (this.WheelsOff == null ? that.WheelsOff == null : this.WheelsOff.equals(that.WheelsOff));
    equal = equal && (this.WheelsOn == null ? that.WheelsOn == null : this.WheelsOn.equals(that.WheelsOn));
    equal = equal && (this.Year == null ? that.Year == null : this.Year.equals(that.Year));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ActualElapsedTime = JdbcWritableBridge.readFloat(1, __dbResults);
    this.AirlineID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.AirTime = JdbcWritableBridge.readFloat(3, __dbResults);
    this.ArrDel15 = JdbcWritableBridge.readInteger(4, __dbResults);
    this.ArrDelay = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.ArrDelayMinutes = JdbcWritableBridge.readFloat(6, __dbResults);
    this.ArrivalDelayGroups = JdbcWritableBridge.readInteger(7, __dbResults);
    this.ArrTime = JdbcWritableBridge.readInteger(8, __dbResults);
    this.ArrTimeBlk = JdbcWritableBridge.readString(9, __dbResults);
    this.CancellationCode = JdbcWritableBridge.readString(10, __dbResults);
    this.Cancelled = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Carrier = JdbcWritableBridge.readString(12, __dbResults);
    this.CarrierDelay = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.CRSArrTime = JdbcWritableBridge.readInteger(14, __dbResults);
    this.CRSDepTime = JdbcWritableBridge.readInteger(15, __dbResults);
    this.CRSElapsedTime = JdbcWritableBridge.readFloat(16, __dbResults);
    this.DayofMonth = JdbcWritableBridge.readInteger(17, __dbResults);
    this.DayOfWeek = JdbcWritableBridge.readInteger(18, __dbResults);
    this.DepartureDelayGroups = JdbcWritableBridge.readInteger(19, __dbResults);
    this.DepDel15 = JdbcWritableBridge.readInteger(20, __dbResults);
    this.DepDelay = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.DepDelayMinutes = JdbcWritableBridge.readFloat(22, __dbResults);
    this.DepTime = JdbcWritableBridge.readInteger(23, __dbResults);
    this.DepTimeBlk = JdbcWritableBridge.readString(24, __dbResults);
    this.Dest = JdbcWritableBridge.readString(25, __dbResults);
    this.DestAirportID = JdbcWritableBridge.readInteger(26, __dbResults);
    this.DestAirportSeqID = JdbcWritableBridge.readInteger(27, __dbResults);
    this.DestCityMarketID = JdbcWritableBridge.readInteger(28, __dbResults);
    this.DestCityName = JdbcWritableBridge.readString(29, __dbResults);
    this.DestState = JdbcWritableBridge.readString(30, __dbResults);
    this.DestStateFips = JdbcWritableBridge.readInteger(31, __dbResults);
    this.DestStateName = JdbcWritableBridge.readString(32, __dbResults);
    this.DestWac = JdbcWritableBridge.readInteger(33, __dbResults);
    this.Distance = JdbcWritableBridge.readFloat(34, __dbResults);
    this.DistanceGroup = JdbcWritableBridge.readInteger(35, __dbResults);
    this.Div1Airport = JdbcWritableBridge.readString(36, __dbResults);
    this.Div1AirportID = JdbcWritableBridge.readInteger(37, __dbResults);
    this.Div1AirportSeqID = JdbcWritableBridge.readInteger(38, __dbResults);
    this.Div1LongestGTime = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.Div1TailNum = JdbcWritableBridge.readString(40, __dbResults);
    this.Div1TotalGTime = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.Div1WheelsOff = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.Div1WheelsOn = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.Div2Airport = JdbcWritableBridge.readString(44, __dbResults);
    this.Div2AirportID = JdbcWritableBridge.readInteger(45, __dbResults);
    this.Div2AirportSeqID = JdbcWritableBridge.readInteger(46, __dbResults);
    this.Div2LongestGTime = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.Div2TotalGTime = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.Div2WheelsOn = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.DivActualElapsedTime = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.DivAirportLandings = JdbcWritableBridge.readInteger(51, __dbResults);
    this.DivArrDelay = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.DivDistance = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.Diverted = JdbcWritableBridge.readInteger(54, __dbResults);
    this.DivReachedDest = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.FirstDepTime = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.FlightDate = JdbcWritableBridge.readDate(57, __dbResults);
    this.FlightNum = JdbcWritableBridge.readInteger(58, __dbResults);
    this.Flights = JdbcWritableBridge.readFloat(59, __dbResults);
    this.LateAircraftDelay = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.LongestAddGTime = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.Month = JdbcWritableBridge.readInteger(62, __dbResults);
    this.NASDelay = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.Origin = JdbcWritableBridge.readString(64, __dbResults);
    this.OriginAirportID = JdbcWritableBridge.readInteger(65, __dbResults);
    this.OriginAirportSeqID = JdbcWritableBridge.readInteger(66, __dbResults);
    this.OriginCityMarketID = JdbcWritableBridge.readInteger(67, __dbResults);
    this.OriginCityName = JdbcWritableBridge.readString(68, __dbResults);
    this.OriginState = JdbcWritableBridge.readString(69, __dbResults);
    this.OriginStateFips = JdbcWritableBridge.readInteger(70, __dbResults);
    this.OriginStateName = JdbcWritableBridge.readString(71, __dbResults);
    this.OriginWac = JdbcWritableBridge.readInteger(72, __dbResults);
    this.Quarter = JdbcWritableBridge.readInteger(73, __dbResults);
    this.SecurityDelay = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.TailNum = JdbcWritableBridge.readString(75, __dbResults);
    this.TaxiIn = JdbcWritableBridge.readFloat(76, __dbResults);
    this.TaxiOut = JdbcWritableBridge.readFloat(77, __dbResults);
    this.TotalAddGTime = JdbcWritableBridge.readBigDecimal(78, __dbResults);
    this.UniqueCarrier = JdbcWritableBridge.readString(79, __dbResults);
    this.WeatherDelay = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.WheelsOff = JdbcWritableBridge.readInteger(81, __dbResults);
    this.WheelsOn = JdbcWritableBridge.readInteger(82, __dbResults);
    this.Year = JdbcWritableBridge.readInteger(83, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ActualElapsedTime = JdbcWritableBridge.readFloat(1, __dbResults);
    this.AirlineID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.AirTime = JdbcWritableBridge.readFloat(3, __dbResults);
    this.ArrDel15 = JdbcWritableBridge.readInteger(4, __dbResults);
    this.ArrDelay = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.ArrDelayMinutes = JdbcWritableBridge.readFloat(6, __dbResults);
    this.ArrivalDelayGroups = JdbcWritableBridge.readInteger(7, __dbResults);
    this.ArrTime = JdbcWritableBridge.readInteger(8, __dbResults);
    this.ArrTimeBlk = JdbcWritableBridge.readString(9, __dbResults);
    this.CancellationCode = JdbcWritableBridge.readString(10, __dbResults);
    this.Cancelled = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Carrier = JdbcWritableBridge.readString(12, __dbResults);
    this.CarrierDelay = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.CRSArrTime = JdbcWritableBridge.readInteger(14, __dbResults);
    this.CRSDepTime = JdbcWritableBridge.readInteger(15, __dbResults);
    this.CRSElapsedTime = JdbcWritableBridge.readFloat(16, __dbResults);
    this.DayofMonth = JdbcWritableBridge.readInteger(17, __dbResults);
    this.DayOfWeek = JdbcWritableBridge.readInteger(18, __dbResults);
    this.DepartureDelayGroups = JdbcWritableBridge.readInteger(19, __dbResults);
    this.DepDel15 = JdbcWritableBridge.readInteger(20, __dbResults);
    this.DepDelay = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.DepDelayMinutes = JdbcWritableBridge.readFloat(22, __dbResults);
    this.DepTime = JdbcWritableBridge.readInteger(23, __dbResults);
    this.DepTimeBlk = JdbcWritableBridge.readString(24, __dbResults);
    this.Dest = JdbcWritableBridge.readString(25, __dbResults);
    this.DestAirportID = JdbcWritableBridge.readInteger(26, __dbResults);
    this.DestAirportSeqID = JdbcWritableBridge.readInteger(27, __dbResults);
    this.DestCityMarketID = JdbcWritableBridge.readInteger(28, __dbResults);
    this.DestCityName = JdbcWritableBridge.readString(29, __dbResults);
    this.DestState = JdbcWritableBridge.readString(30, __dbResults);
    this.DestStateFips = JdbcWritableBridge.readInteger(31, __dbResults);
    this.DestStateName = JdbcWritableBridge.readString(32, __dbResults);
    this.DestWac = JdbcWritableBridge.readInteger(33, __dbResults);
    this.Distance = JdbcWritableBridge.readFloat(34, __dbResults);
    this.DistanceGroup = JdbcWritableBridge.readInteger(35, __dbResults);
    this.Div1Airport = JdbcWritableBridge.readString(36, __dbResults);
    this.Div1AirportID = JdbcWritableBridge.readInteger(37, __dbResults);
    this.Div1AirportSeqID = JdbcWritableBridge.readInteger(38, __dbResults);
    this.Div1LongestGTime = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.Div1TailNum = JdbcWritableBridge.readString(40, __dbResults);
    this.Div1TotalGTime = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.Div1WheelsOff = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.Div1WheelsOn = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.Div2Airport = JdbcWritableBridge.readString(44, __dbResults);
    this.Div2AirportID = JdbcWritableBridge.readInteger(45, __dbResults);
    this.Div2AirportSeqID = JdbcWritableBridge.readInteger(46, __dbResults);
    this.Div2LongestGTime = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.Div2TotalGTime = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.Div2WheelsOn = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.DivActualElapsedTime = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.DivAirportLandings = JdbcWritableBridge.readInteger(51, __dbResults);
    this.DivArrDelay = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.DivDistance = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.Diverted = JdbcWritableBridge.readInteger(54, __dbResults);
    this.DivReachedDest = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.FirstDepTime = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.FlightDate = JdbcWritableBridge.readDate(57, __dbResults);
    this.FlightNum = JdbcWritableBridge.readInteger(58, __dbResults);
    this.Flights = JdbcWritableBridge.readFloat(59, __dbResults);
    this.LateAircraftDelay = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.LongestAddGTime = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.Month = JdbcWritableBridge.readInteger(62, __dbResults);
    this.NASDelay = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.Origin = JdbcWritableBridge.readString(64, __dbResults);
    this.OriginAirportID = JdbcWritableBridge.readInteger(65, __dbResults);
    this.OriginAirportSeqID = JdbcWritableBridge.readInteger(66, __dbResults);
    this.OriginCityMarketID = JdbcWritableBridge.readInteger(67, __dbResults);
    this.OriginCityName = JdbcWritableBridge.readString(68, __dbResults);
    this.OriginState = JdbcWritableBridge.readString(69, __dbResults);
    this.OriginStateFips = JdbcWritableBridge.readInteger(70, __dbResults);
    this.OriginStateName = JdbcWritableBridge.readString(71, __dbResults);
    this.OriginWac = JdbcWritableBridge.readInteger(72, __dbResults);
    this.Quarter = JdbcWritableBridge.readInteger(73, __dbResults);
    this.SecurityDelay = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.TailNum = JdbcWritableBridge.readString(75, __dbResults);
    this.TaxiIn = JdbcWritableBridge.readFloat(76, __dbResults);
    this.TaxiOut = JdbcWritableBridge.readFloat(77, __dbResults);
    this.TotalAddGTime = JdbcWritableBridge.readBigDecimal(78, __dbResults);
    this.UniqueCarrier = JdbcWritableBridge.readString(79, __dbResults);
    this.WeatherDelay = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.WheelsOff = JdbcWritableBridge.readInteger(81, __dbResults);
    this.WheelsOn = JdbcWritableBridge.readInteger(82, __dbResults);
    this.Year = JdbcWritableBridge.readInteger(83, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeFloat(ActualElapsedTime, 1 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(AirlineID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(AirTime, 3 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrDel15, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ArrDelay, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeFloat(ArrDelayMinutes, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrivalDelayGroups, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrTime, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(ArrTimeBlk, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(CancellationCode, 10 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Cancelled, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Carrier, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CarrierDelay, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSArrTime, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSDepTime, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(CRSElapsedTime, 16 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(DayofMonth, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DayOfWeek, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DepartureDelayGroups, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DepDel15, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DepDelay, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeFloat(DepDelayMinutes, 22 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(DepTime, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(DepTimeBlk, 24 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Dest, 25 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(DestAirportID, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DestAirportSeqID, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DestCityMarketID, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(DestCityName, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DestState, 30 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(DestStateFips, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(DestStateName, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(DestWac, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(Distance, 34 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(DistanceGroup, 35 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Div1Airport, 36 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Div1AirportID, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Div1AirportSeqID, 38 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div1LongestGTime, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Div1TailNum, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div1TotalGTime, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div1WheelsOff, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div1WheelsOn, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Div2Airport, 44 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Div2AirportID, 45 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Div2AirportSeqID, 46 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div2LongestGTime, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div2TotalGTime, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div2WheelsOn, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DivActualElapsedTime, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(DivAirportLandings, 51 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DivArrDelay, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DivDistance, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(Diverted, 54 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DivReachedDest, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FirstDepTime, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDate(FlightDate, 57 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(FlightNum, 58 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(Flights, 59 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LateAircraftDelay, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LongestAddGTime, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(Month, 62 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NASDelay, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Origin, 64 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginAirportID, 65 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginAirportSeqID, 66 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginCityMarketID, 67 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(OriginCityName, 68 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OriginState, 69 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginStateFips, 70 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(OriginStateName, 71 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginWac, 72 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Quarter, 73 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SecurityDelay, 74 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(TailNum, 75 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(TaxiIn, 76 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(TaxiOut, 77 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TotalAddGTime, 78 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(UniqueCarrier, 79 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WeatherDelay, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(WheelsOff, 81 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(WheelsOn, 82 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Year, 83 + __off, 4, __dbStmt);
    return 83;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeFloat(ActualElapsedTime, 1 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(AirlineID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(AirTime, 3 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrDel15, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ArrDelay, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeFloat(ArrDelayMinutes, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrivalDelayGroups, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ArrTime, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(ArrTimeBlk, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(CancellationCode, 10 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Cancelled, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Carrier, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CarrierDelay, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSArrTime, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CRSDepTime, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(CRSElapsedTime, 16 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(DayofMonth, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DayOfWeek, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DepartureDelayGroups, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DepDel15, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DepDelay, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeFloat(DepDelayMinutes, 22 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(DepTime, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(DepTimeBlk, 24 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Dest, 25 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(DestAirportID, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DestAirportSeqID, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DestCityMarketID, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(DestCityName, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DestState, 30 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(DestStateFips, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(DestStateName, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(DestWac, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(Distance, 34 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(DistanceGroup, 35 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Div1Airport, 36 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Div1AirportID, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Div1AirportSeqID, 38 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div1LongestGTime, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Div1TailNum, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div1TotalGTime, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div1WheelsOff, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div1WheelsOn, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Div2Airport, 44 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(Div2AirportID, 45 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Div2AirportSeqID, 46 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div2LongestGTime, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div2TotalGTime, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Div2WheelsOn, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DivActualElapsedTime, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(DivAirportLandings, 51 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DivArrDelay, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DivDistance, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(Diverted, 54 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DivReachedDest, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FirstDepTime, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDate(FlightDate, 57 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(FlightNum, 58 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(Flights, 59 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LateAircraftDelay, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LongestAddGTime, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(Month, 62 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NASDelay, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Origin, 64 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginAirportID, 65 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginAirportSeqID, 66 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginCityMarketID, 67 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(OriginCityName, 68 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OriginState, 69 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginStateFips, 70 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(OriginStateName, 71 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(OriginWac, 72 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Quarter, 73 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SecurityDelay, 74 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(TailNum, 75 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(TaxiIn, 76 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(TaxiOut, 77 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TotalAddGTime, 78 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(UniqueCarrier, 79 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WeatherDelay, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(WheelsOff, 81 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(WheelsOn, 82 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Year, 83 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ActualElapsedTime = null;
    } else {
    this.ActualElapsedTime = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.AirlineID = null;
    } else {
    this.AirlineID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.AirTime = null;
    } else {
    this.AirTime = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.ArrDel15 = null;
    } else {
    this.ArrDel15 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ArrDelay = null;
    } else {
    this.ArrDelay = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ArrDelayMinutes = null;
    } else {
    this.ArrDelayMinutes = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.ArrivalDelayGroups = null;
    } else {
    this.ArrivalDelayGroups = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ArrTime = null;
    } else {
    this.ArrTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ArrTimeBlk = null;
    } else {
    this.ArrTimeBlk = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CancellationCode = null;
    } else {
    this.CancellationCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Cancelled = null;
    } else {
    this.Cancelled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Carrier = null;
    } else {
    this.Carrier = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CarrierDelay = null;
    } else {
    this.CarrierDelay = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CRSArrTime = null;
    } else {
    this.CRSArrTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CRSDepTime = null;
    } else {
    this.CRSDepTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CRSElapsedTime = null;
    } else {
    this.CRSElapsedTime = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.DayofMonth = null;
    } else {
    this.DayofMonth = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DayOfWeek = null;
    } else {
    this.DayOfWeek = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DepartureDelayGroups = null;
    } else {
    this.DepartureDelayGroups = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DepDel15 = null;
    } else {
    this.DepDel15 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DepDelay = null;
    } else {
    this.DepDelay = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DepDelayMinutes = null;
    } else {
    this.DepDelayMinutes = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.DepTime = null;
    } else {
    this.DepTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DepTimeBlk = null;
    } else {
    this.DepTimeBlk = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Dest = null;
    } else {
    this.Dest = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DestAirportID = null;
    } else {
    this.DestAirportID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DestAirportSeqID = null;
    } else {
    this.DestAirportSeqID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DestCityMarketID = null;
    } else {
    this.DestCityMarketID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DestCityName = null;
    } else {
    this.DestCityName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DestState = null;
    } else {
    this.DestState = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DestStateFips = null;
    } else {
    this.DestStateFips = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DestStateName = null;
    } else {
    this.DestStateName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DestWac = null;
    } else {
    this.DestWac = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Distance = null;
    } else {
    this.Distance = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.DistanceGroup = null;
    } else {
    this.DistanceGroup = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Div1Airport = null;
    } else {
    this.Div1Airport = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Div1AirportID = null;
    } else {
    this.Div1AirportID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Div1AirportSeqID = null;
    } else {
    this.Div1AirportSeqID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Div1LongestGTime = null;
    } else {
    this.Div1LongestGTime = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Div1TailNum = null;
    } else {
    this.Div1TailNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Div1TotalGTime = null;
    } else {
    this.Div1TotalGTime = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Div1WheelsOff = null;
    } else {
    this.Div1WheelsOff = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Div1WheelsOn = null;
    } else {
    this.Div1WheelsOn = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Div2Airport = null;
    } else {
    this.Div2Airport = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Div2AirportID = null;
    } else {
    this.Div2AirportID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Div2AirportSeqID = null;
    } else {
    this.Div2AirportSeqID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Div2LongestGTime = null;
    } else {
    this.Div2LongestGTime = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Div2TotalGTime = null;
    } else {
    this.Div2TotalGTime = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Div2WheelsOn = null;
    } else {
    this.Div2WheelsOn = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DivActualElapsedTime = null;
    } else {
    this.DivActualElapsedTime = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DivAirportLandings = null;
    } else {
    this.DivAirportLandings = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DivArrDelay = null;
    } else {
    this.DivArrDelay = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DivDistance = null;
    } else {
    this.DivDistance = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Diverted = null;
    } else {
    this.Diverted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DivReachedDest = null;
    } else {
    this.DivReachedDest = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FirstDepTime = null;
    } else {
    this.FirstDepTime = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FlightDate = null;
    } else {
    this.FlightDate = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.FlightNum = null;
    } else {
    this.FlightNum = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Flights = null;
    } else {
    this.Flights = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.LateAircraftDelay = null;
    } else {
    this.LateAircraftDelay = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LongestAddGTime = null;
    } else {
    this.LongestAddGTime = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Month = null;
    } else {
    this.Month = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.NASDelay = null;
    } else {
    this.NASDelay = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Origin = null;
    } else {
    this.Origin = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OriginAirportID = null;
    } else {
    this.OriginAirportID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.OriginAirportSeqID = null;
    } else {
    this.OriginAirportSeqID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.OriginCityMarketID = null;
    } else {
    this.OriginCityMarketID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.OriginCityName = null;
    } else {
    this.OriginCityName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OriginState = null;
    } else {
    this.OriginState = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OriginStateFips = null;
    } else {
    this.OriginStateFips = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.OriginStateName = null;
    } else {
    this.OriginStateName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OriginWac = null;
    } else {
    this.OriginWac = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Quarter = null;
    } else {
    this.Quarter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SecurityDelay = null;
    } else {
    this.SecurityDelay = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TailNum = null;
    } else {
    this.TailNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TaxiIn = null;
    } else {
    this.TaxiIn = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.TaxiOut = null;
    } else {
    this.TaxiOut = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.TotalAddGTime = null;
    } else {
    this.TotalAddGTime = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UniqueCarrier = null;
    } else {
    this.UniqueCarrier = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WeatherDelay = null;
    } else {
    this.WeatherDelay = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WheelsOff = null;
    } else {
    this.WheelsOff = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WheelsOn = null;
    } else {
    this.WheelsOn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Year = null;
    } else {
    this.Year = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ActualElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.ActualElapsedTime);
    }
    if (null == this.AirlineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.AirlineID);
    }
    if (null == this.AirTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.AirTime);
    }
    if (null == this.ArrDel15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrDel15);
    }
    if (null == this.ArrDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ArrDelay, __dataOut);
    }
    if (null == this.ArrDelayMinutes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.ArrDelayMinutes);
    }
    if (null == this.ArrivalDelayGroups) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrivalDelayGroups);
    }
    if (null == this.ArrTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrTime);
    }
    if (null == this.ArrTimeBlk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ArrTimeBlk);
    }
    if (null == this.CancellationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CancellationCode);
    }
    if (null == this.Cancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Cancelled);
    }
    if (null == this.Carrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Carrier);
    }
    if (null == this.CarrierDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CarrierDelay, __dataOut);
    }
    if (null == this.CRSArrTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSArrTime);
    }
    if (null == this.CRSDepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSDepTime);
    }
    if (null == this.CRSElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.CRSElapsedTime);
    }
    if (null == this.DayofMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayofMonth);
    }
    if (null == this.DayOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayOfWeek);
    }
    if (null == this.DepartureDelayGroups) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepartureDelayGroups);
    }
    if (null == this.DepDel15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepDel15);
    }
    if (null == this.DepDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DepDelay, __dataOut);
    }
    if (null == this.DepDelayMinutes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.DepDelayMinutes);
    }
    if (null == this.DepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepTime);
    }
    if (null == this.DepTimeBlk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DepTimeBlk);
    }
    if (null == this.Dest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dest);
    }
    if (null == this.DestAirportID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestAirportID);
    }
    if (null == this.DestAirportSeqID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestAirportSeqID);
    }
    if (null == this.DestCityMarketID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestCityMarketID);
    }
    if (null == this.DestCityName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DestCityName);
    }
    if (null == this.DestState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DestState);
    }
    if (null == this.DestStateFips) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestStateFips);
    }
    if (null == this.DestStateName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DestStateName);
    }
    if (null == this.DestWac) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestWac);
    }
    if (null == this.Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Distance);
    }
    if (null == this.DistanceGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DistanceGroup);
    }
    if (null == this.Div1Airport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Div1Airport);
    }
    if (null == this.Div1AirportID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Div1AirportID);
    }
    if (null == this.Div1AirportSeqID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Div1AirportSeqID);
    }
    if (null == this.Div1LongestGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div1LongestGTime, __dataOut);
    }
    if (null == this.Div1TailNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Div1TailNum);
    }
    if (null == this.Div1TotalGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div1TotalGTime, __dataOut);
    }
    if (null == this.Div1WheelsOff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div1WheelsOff, __dataOut);
    }
    if (null == this.Div1WheelsOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div1WheelsOn, __dataOut);
    }
    if (null == this.Div2Airport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Div2Airport);
    }
    if (null == this.Div2AirportID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Div2AirportID);
    }
    if (null == this.Div2AirportSeqID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Div2AirportSeqID);
    }
    if (null == this.Div2LongestGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div2LongestGTime, __dataOut);
    }
    if (null == this.Div2TotalGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div2TotalGTime, __dataOut);
    }
    if (null == this.Div2WheelsOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div2WheelsOn, __dataOut);
    }
    if (null == this.DivActualElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DivActualElapsedTime, __dataOut);
    }
    if (null == this.DivAirportLandings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DivAirportLandings);
    }
    if (null == this.DivArrDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DivArrDelay, __dataOut);
    }
    if (null == this.DivDistance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DivDistance, __dataOut);
    }
    if (null == this.Diverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Diverted);
    }
    if (null == this.DivReachedDest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DivReachedDest, __dataOut);
    }
    if (null == this.FirstDepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FirstDepTime, __dataOut);
    }
    if (null == this.FlightDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FlightDate.getTime());
    }
    if (null == this.FlightNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FlightNum);
    }
    if (null == this.Flights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Flights);
    }
    if (null == this.LateAircraftDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LateAircraftDelay, __dataOut);
    }
    if (null == this.LongestAddGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LongestAddGTime, __dataOut);
    }
    if (null == this.Month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Month);
    }
    if (null == this.NASDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NASDelay, __dataOut);
    }
    if (null == this.Origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Origin);
    }
    if (null == this.OriginAirportID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginAirportID);
    }
    if (null == this.OriginAirportSeqID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginAirportSeqID);
    }
    if (null == this.OriginCityMarketID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginCityMarketID);
    }
    if (null == this.OriginCityName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OriginCityName);
    }
    if (null == this.OriginState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OriginState);
    }
    if (null == this.OriginStateFips) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginStateFips);
    }
    if (null == this.OriginStateName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OriginStateName);
    }
    if (null == this.OriginWac) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginWac);
    }
    if (null == this.Quarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quarter);
    }
    if (null == this.SecurityDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SecurityDelay, __dataOut);
    }
    if (null == this.TailNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TailNum);
    }
    if (null == this.TaxiIn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.TaxiIn);
    }
    if (null == this.TaxiOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.TaxiOut);
    }
    if (null == this.TotalAddGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TotalAddGTime, __dataOut);
    }
    if (null == this.UniqueCarrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UniqueCarrier);
    }
    if (null == this.WeatherDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WeatherDelay, __dataOut);
    }
    if (null == this.WheelsOff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WheelsOff);
    }
    if (null == this.WheelsOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WheelsOn);
    }
    if (null == this.Year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Year);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ActualElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.ActualElapsedTime);
    }
    if (null == this.AirlineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.AirlineID);
    }
    if (null == this.AirTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.AirTime);
    }
    if (null == this.ArrDel15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrDel15);
    }
    if (null == this.ArrDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ArrDelay, __dataOut);
    }
    if (null == this.ArrDelayMinutes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.ArrDelayMinutes);
    }
    if (null == this.ArrivalDelayGroups) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrivalDelayGroups);
    }
    if (null == this.ArrTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ArrTime);
    }
    if (null == this.ArrTimeBlk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ArrTimeBlk);
    }
    if (null == this.CancellationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CancellationCode);
    }
    if (null == this.Cancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Cancelled);
    }
    if (null == this.Carrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Carrier);
    }
    if (null == this.CarrierDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CarrierDelay, __dataOut);
    }
    if (null == this.CRSArrTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSArrTime);
    }
    if (null == this.CRSDepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CRSDepTime);
    }
    if (null == this.CRSElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.CRSElapsedTime);
    }
    if (null == this.DayofMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayofMonth);
    }
    if (null == this.DayOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayOfWeek);
    }
    if (null == this.DepartureDelayGroups) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepartureDelayGroups);
    }
    if (null == this.DepDel15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepDel15);
    }
    if (null == this.DepDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DepDelay, __dataOut);
    }
    if (null == this.DepDelayMinutes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.DepDelayMinutes);
    }
    if (null == this.DepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DepTime);
    }
    if (null == this.DepTimeBlk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DepTimeBlk);
    }
    if (null == this.Dest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Dest);
    }
    if (null == this.DestAirportID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestAirportID);
    }
    if (null == this.DestAirportSeqID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestAirportSeqID);
    }
    if (null == this.DestCityMarketID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestCityMarketID);
    }
    if (null == this.DestCityName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DestCityName);
    }
    if (null == this.DestState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DestState);
    }
    if (null == this.DestStateFips) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestStateFips);
    }
    if (null == this.DestStateName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DestStateName);
    }
    if (null == this.DestWac) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DestWac);
    }
    if (null == this.Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Distance);
    }
    if (null == this.DistanceGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DistanceGroup);
    }
    if (null == this.Div1Airport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Div1Airport);
    }
    if (null == this.Div1AirportID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Div1AirportID);
    }
    if (null == this.Div1AirportSeqID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Div1AirportSeqID);
    }
    if (null == this.Div1LongestGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div1LongestGTime, __dataOut);
    }
    if (null == this.Div1TailNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Div1TailNum);
    }
    if (null == this.Div1TotalGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div1TotalGTime, __dataOut);
    }
    if (null == this.Div1WheelsOff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div1WheelsOff, __dataOut);
    }
    if (null == this.Div1WheelsOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div1WheelsOn, __dataOut);
    }
    if (null == this.Div2Airport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Div2Airport);
    }
    if (null == this.Div2AirportID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Div2AirportID);
    }
    if (null == this.Div2AirportSeqID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Div2AirportSeqID);
    }
    if (null == this.Div2LongestGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div2LongestGTime, __dataOut);
    }
    if (null == this.Div2TotalGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div2TotalGTime, __dataOut);
    }
    if (null == this.Div2WheelsOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Div2WheelsOn, __dataOut);
    }
    if (null == this.DivActualElapsedTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DivActualElapsedTime, __dataOut);
    }
    if (null == this.DivAirportLandings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DivAirportLandings);
    }
    if (null == this.DivArrDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DivArrDelay, __dataOut);
    }
    if (null == this.DivDistance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DivDistance, __dataOut);
    }
    if (null == this.Diverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Diverted);
    }
    if (null == this.DivReachedDest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DivReachedDest, __dataOut);
    }
    if (null == this.FirstDepTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FirstDepTime, __dataOut);
    }
    if (null == this.FlightDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FlightDate.getTime());
    }
    if (null == this.FlightNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FlightNum);
    }
    if (null == this.Flights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Flights);
    }
    if (null == this.LateAircraftDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LateAircraftDelay, __dataOut);
    }
    if (null == this.LongestAddGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LongestAddGTime, __dataOut);
    }
    if (null == this.Month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Month);
    }
    if (null == this.NASDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NASDelay, __dataOut);
    }
    if (null == this.Origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Origin);
    }
    if (null == this.OriginAirportID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginAirportID);
    }
    if (null == this.OriginAirportSeqID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginAirportSeqID);
    }
    if (null == this.OriginCityMarketID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginCityMarketID);
    }
    if (null == this.OriginCityName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OriginCityName);
    }
    if (null == this.OriginState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OriginState);
    }
    if (null == this.OriginStateFips) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginStateFips);
    }
    if (null == this.OriginStateName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OriginStateName);
    }
    if (null == this.OriginWac) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OriginWac);
    }
    if (null == this.Quarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quarter);
    }
    if (null == this.SecurityDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SecurityDelay, __dataOut);
    }
    if (null == this.TailNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TailNum);
    }
    if (null == this.TaxiIn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.TaxiIn);
    }
    if (null == this.TaxiOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.TaxiOut);
    }
    if (null == this.TotalAddGTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TotalAddGTime, __dataOut);
    }
    if (null == this.UniqueCarrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UniqueCarrier);
    }
    if (null == this.WeatherDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WeatherDelay, __dataOut);
    }
    if (null == this.WheelsOff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WheelsOff);
    }
    if (null == this.WheelsOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WheelsOn);
    }
    if (null == this.Year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Year);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(ActualElapsedTime==null?"null":"" + ActualElapsedTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AirlineID==null?"null":"" + AirlineID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AirTime==null?"null":"" + AirTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrDel15==null?"null":"" + ArrDel15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrDelay==null?"null":ArrDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrDelayMinutes==null?"null":"" + ArrDelayMinutes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrivalDelayGroups==null?"null":"" + ArrivalDelayGroups, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrTime==null?"null":"" + ArrTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrTimeBlk==null?"null":ArrTimeBlk, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CancellationCode==null?"null":CancellationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Cancelled==null?"null":"" + Cancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Carrier==null?"null":Carrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarrierDelay==null?"null":CarrierDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSArrTime==null?"null":"" + CRSArrTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSDepTime==null?"null":"" + CRSDepTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSElapsedTime==null?"null":"" + CRSElapsedTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayofMonth==null?"null":"" + DayofMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayOfWeek==null?"null":"" + DayOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepartureDelayGroups==null?"null":"" + DepartureDelayGroups, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepDel15==null?"null":"" + DepDel15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepDelay==null?"null":DepDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepDelayMinutes==null?"null":"" + DepDelayMinutes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepTime==null?"null":"" + DepTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepTimeBlk==null?"null":DepTimeBlk, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dest==null?"null":Dest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestAirportID==null?"null":"" + DestAirportID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestAirportSeqID==null?"null":"" + DestAirportSeqID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestCityMarketID==null?"null":"" + DestCityMarketID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestCityName==null?"null":DestCityName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestState==null?"null":DestState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestStateFips==null?"null":"" + DestStateFips, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestStateName==null?"null":DestStateName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestWac==null?"null":"" + DestWac, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Distance==null?"null":"" + Distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DistanceGroup==null?"null":"" + DistanceGroup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1Airport==null?"null":Div1Airport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1AirportID==null?"null":"" + Div1AirportID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1AirportSeqID==null?"null":"" + Div1AirportSeqID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1LongestGTime==null?"null":Div1LongestGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1TailNum==null?"null":Div1TailNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1TotalGTime==null?"null":Div1TotalGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1WheelsOff==null?"null":Div1WheelsOff.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1WheelsOn==null?"null":Div1WheelsOn.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2Airport==null?"null":Div2Airport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2AirportID==null?"null":"" + Div2AirportID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2AirportSeqID==null?"null":"" + Div2AirportSeqID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2LongestGTime==null?"null":Div2LongestGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2TotalGTime==null?"null":Div2TotalGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2WheelsOn==null?"null":Div2WheelsOn.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivActualElapsedTime==null?"null":DivActualElapsedTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivAirportLandings==null?"null":"" + DivAirportLandings, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivArrDelay==null?"null":DivArrDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivDistance==null?"null":DivDistance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Diverted==null?"null":"" + Diverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivReachedDest==null?"null":DivReachedDest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FirstDepTime==null?"null":FirstDepTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FlightDate==null?"null":"" + FlightDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FlightNum==null?"null":"" + FlightNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Flights==null?"null":"" + Flights, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LateAircraftDelay==null?"null":LateAircraftDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LongestAddGTime==null?"null":LongestAddGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Month==null?"null":"" + Month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NASDelay==null?"null":NASDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Origin==null?"null":Origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginAirportID==null?"null":"" + OriginAirportID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginAirportSeqID==null?"null":"" + OriginAirportSeqID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginCityMarketID==null?"null":"" + OriginCityMarketID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginCityName==null?"null":OriginCityName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginState==null?"null":OriginState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginStateFips==null?"null":"" + OriginStateFips, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginStateName==null?"null":OriginStateName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginWac==null?"null":"" + OriginWac, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quarter==null?"null":"" + Quarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SecurityDelay==null?"null":SecurityDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TailNum==null?"null":TailNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiIn==null?"null":"" + TaxiIn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiOut==null?"null":"" + TaxiOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TotalAddGTime==null?"null":TotalAddGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UniqueCarrier==null?"null":UniqueCarrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeatherDelay==null?"null":WeatherDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WheelsOff==null?"null":"" + WheelsOff, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WheelsOn==null?"null":"" + WheelsOn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Year==null?"null":"" + Year, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ActualElapsedTime==null?"null":"" + ActualElapsedTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AirlineID==null?"null":"" + AirlineID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AirTime==null?"null":"" + AirTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrDel15==null?"null":"" + ArrDel15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrDelay==null?"null":ArrDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrDelayMinutes==null?"null":"" + ArrDelayMinutes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrivalDelayGroups==null?"null":"" + ArrivalDelayGroups, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrTime==null?"null":"" + ArrTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArrTimeBlk==null?"null":ArrTimeBlk, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CancellationCode==null?"null":CancellationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Cancelled==null?"null":"" + Cancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Carrier==null?"null":Carrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarrierDelay==null?"null":CarrierDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSArrTime==null?"null":"" + CRSArrTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSDepTime==null?"null":"" + CRSDepTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRSElapsedTime==null?"null":"" + CRSElapsedTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayofMonth==null?"null":"" + DayofMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayOfWeek==null?"null":"" + DayOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepartureDelayGroups==null?"null":"" + DepartureDelayGroups, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepDel15==null?"null":"" + DepDel15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepDelay==null?"null":DepDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepDelayMinutes==null?"null":"" + DepDelayMinutes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepTime==null?"null":"" + DepTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DepTimeBlk==null?"null":DepTimeBlk, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dest==null?"null":Dest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestAirportID==null?"null":"" + DestAirportID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestAirportSeqID==null?"null":"" + DestAirportSeqID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestCityMarketID==null?"null":"" + DestCityMarketID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestCityName==null?"null":DestCityName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestState==null?"null":DestState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestStateFips==null?"null":"" + DestStateFips, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestStateName==null?"null":DestStateName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DestWac==null?"null":"" + DestWac, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Distance==null?"null":"" + Distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DistanceGroup==null?"null":"" + DistanceGroup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1Airport==null?"null":Div1Airport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1AirportID==null?"null":"" + Div1AirportID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1AirportSeqID==null?"null":"" + Div1AirportSeqID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1LongestGTime==null?"null":Div1LongestGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1TailNum==null?"null":Div1TailNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1TotalGTime==null?"null":Div1TotalGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1WheelsOff==null?"null":Div1WheelsOff.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div1WheelsOn==null?"null":Div1WheelsOn.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2Airport==null?"null":Div2Airport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2AirportID==null?"null":"" + Div2AirportID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2AirportSeqID==null?"null":"" + Div2AirportSeqID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2LongestGTime==null?"null":Div2LongestGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2TotalGTime==null?"null":Div2TotalGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Div2WheelsOn==null?"null":Div2WheelsOn.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivActualElapsedTime==null?"null":DivActualElapsedTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivAirportLandings==null?"null":"" + DivAirportLandings, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivArrDelay==null?"null":DivArrDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivDistance==null?"null":DivDistance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Diverted==null?"null":"" + Diverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DivReachedDest==null?"null":DivReachedDest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FirstDepTime==null?"null":FirstDepTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FlightDate==null?"null":"" + FlightDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FlightNum==null?"null":"" + FlightNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Flights==null?"null":"" + Flights, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LateAircraftDelay==null?"null":LateAircraftDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LongestAddGTime==null?"null":LongestAddGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Month==null?"null":"" + Month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NASDelay==null?"null":NASDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Origin==null?"null":Origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginAirportID==null?"null":"" + OriginAirportID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginAirportSeqID==null?"null":"" + OriginAirportSeqID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginCityMarketID==null?"null":"" + OriginCityMarketID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginCityName==null?"null":OriginCityName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginState==null?"null":OriginState, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginStateFips==null?"null":"" + OriginStateFips, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginStateName==null?"null":OriginStateName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OriginWac==null?"null":"" + OriginWac, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quarter==null?"null":"" + Quarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SecurityDelay==null?"null":SecurityDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TailNum==null?"null":TailNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiIn==null?"null":"" + TaxiIn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxiOut==null?"null":"" + TaxiOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TotalAddGTime==null?"null":TotalAddGTime.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UniqueCarrier==null?"null":UniqueCarrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeatherDelay==null?"null":WeatherDelay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WheelsOff==null?"null":"" + WheelsOff, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WheelsOn==null?"null":"" + WheelsOn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Year==null?"null":"" + Year, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ActualElapsedTime = null; } else {
      this.ActualElapsedTime = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AirlineID = null; } else {
      this.AirlineID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AirTime = null; } else {
      this.AirTime = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrDel15 = null; } else {
      this.ArrDel15 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrDelay = null; } else {
      this.ArrDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrDelayMinutes = null; } else {
      this.ArrDelayMinutes = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrivalDelayGroups = null; } else {
      this.ArrivalDelayGroups = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrTime = null; } else {
      this.ArrTime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ArrTimeBlk = null; } else {
      this.ArrTimeBlk = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CancellationCode = null; } else {
      this.CancellationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Cancelled = null; } else {
      this.Cancelled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Carrier = null; } else {
      this.Carrier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CarrierDelay = null; } else {
      this.CarrierDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSArrTime = null; } else {
      this.CRSArrTime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSDepTime = null; } else {
      this.CRSDepTime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSElapsedTime = null; } else {
      this.CRSElapsedTime = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayofMonth = null; } else {
      this.DayofMonth = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayOfWeek = null; } else {
      this.DayOfWeek = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepartureDelayGroups = null; } else {
      this.DepartureDelayGroups = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepDel15 = null; } else {
      this.DepDel15 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepDelay = null; } else {
      this.DepDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepDelayMinutes = null; } else {
      this.DepDelayMinutes = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepTime = null; } else {
      this.DepTime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DepTimeBlk = null; } else {
      this.DepTimeBlk = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Dest = null; } else {
      this.Dest = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestAirportID = null; } else {
      this.DestAirportID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestAirportSeqID = null; } else {
      this.DestAirportSeqID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestCityMarketID = null; } else {
      this.DestCityMarketID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DestCityName = null; } else {
      this.DestCityName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DestState = null; } else {
      this.DestState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestStateFips = null; } else {
      this.DestStateFips = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DestStateName = null; } else {
      this.DestStateName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestWac = null; } else {
      this.DestWac = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Distance = null; } else {
      this.Distance = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DistanceGroup = null; } else {
      this.DistanceGroup = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Div1Airport = null; } else {
      this.Div1Airport = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1AirportID = null; } else {
      this.Div1AirportID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1AirportSeqID = null; } else {
      this.Div1AirportSeqID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1LongestGTime = null; } else {
      this.Div1LongestGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Div1TailNum = null; } else {
      this.Div1TailNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1TotalGTime = null; } else {
      this.Div1TotalGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1WheelsOff = null; } else {
      this.Div1WheelsOff = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1WheelsOn = null; } else {
      this.Div1WheelsOn = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Div2Airport = null; } else {
      this.Div2Airport = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2AirportID = null; } else {
      this.Div2AirportID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2AirportSeqID = null; } else {
      this.Div2AirportSeqID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2LongestGTime = null; } else {
      this.Div2LongestGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2TotalGTime = null; } else {
      this.Div2TotalGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2WheelsOn = null; } else {
      this.Div2WheelsOn = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivActualElapsedTime = null; } else {
      this.DivActualElapsedTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivAirportLandings = null; } else {
      this.DivAirportLandings = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivArrDelay = null; } else {
      this.DivArrDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivDistance = null; } else {
      this.DivDistance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Diverted = null; } else {
      this.Diverted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivReachedDest = null; } else {
      this.DivReachedDest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FirstDepTime = null; } else {
      this.FirstDepTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FlightDate = null; } else {
      this.FlightDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FlightNum = null; } else {
      this.FlightNum = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Flights = null; } else {
      this.Flights = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LateAircraftDelay = null; } else {
      this.LateAircraftDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LongestAddGTime = null; } else {
      this.LongestAddGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Month = null; } else {
      this.Month = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NASDelay = null; } else {
      this.NASDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Origin = null; } else {
      this.Origin = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginAirportID = null; } else {
      this.OriginAirportID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginAirportSeqID = null; } else {
      this.OriginAirportSeqID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginCityMarketID = null; } else {
      this.OriginCityMarketID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OriginCityName = null; } else {
      this.OriginCityName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OriginState = null; } else {
      this.OriginState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginStateFips = null; } else {
      this.OriginStateFips = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OriginStateName = null; } else {
      this.OriginStateName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginWac = null; } else {
      this.OriginWac = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quarter = null; } else {
      this.Quarter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SecurityDelay = null; } else {
      this.SecurityDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TailNum = null; } else {
      this.TailNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiIn = null; } else {
      this.TaxiIn = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiOut = null; } else {
      this.TaxiOut = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TotalAddGTime = null; } else {
      this.TotalAddGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.UniqueCarrier = null; } else {
      this.UniqueCarrier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WeatherDelay = null; } else {
      this.WeatherDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WheelsOff = null; } else {
      this.WheelsOff = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WheelsOn = null; } else {
      this.WheelsOn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Year = null; } else {
      this.Year = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ActualElapsedTime = null; } else {
      this.ActualElapsedTime = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AirlineID = null; } else {
      this.AirlineID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AirTime = null; } else {
      this.AirTime = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrDel15 = null; } else {
      this.ArrDel15 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrDelay = null; } else {
      this.ArrDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrDelayMinutes = null; } else {
      this.ArrDelayMinutes = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrivalDelayGroups = null; } else {
      this.ArrivalDelayGroups = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ArrTime = null; } else {
      this.ArrTime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ArrTimeBlk = null; } else {
      this.ArrTimeBlk = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CancellationCode = null; } else {
      this.CancellationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Cancelled = null; } else {
      this.Cancelled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Carrier = null; } else {
      this.Carrier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CarrierDelay = null; } else {
      this.CarrierDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSArrTime = null; } else {
      this.CRSArrTime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSDepTime = null; } else {
      this.CRSDepTime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRSElapsedTime = null; } else {
      this.CRSElapsedTime = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayofMonth = null; } else {
      this.DayofMonth = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayOfWeek = null; } else {
      this.DayOfWeek = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepartureDelayGroups = null; } else {
      this.DepartureDelayGroups = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepDel15 = null; } else {
      this.DepDel15 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepDelay = null; } else {
      this.DepDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepDelayMinutes = null; } else {
      this.DepDelayMinutes = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DepTime = null; } else {
      this.DepTime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DepTimeBlk = null; } else {
      this.DepTimeBlk = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Dest = null; } else {
      this.Dest = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestAirportID = null; } else {
      this.DestAirportID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestAirportSeqID = null; } else {
      this.DestAirportSeqID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestCityMarketID = null; } else {
      this.DestCityMarketID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DestCityName = null; } else {
      this.DestCityName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DestState = null; } else {
      this.DestState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestStateFips = null; } else {
      this.DestStateFips = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DestStateName = null; } else {
      this.DestStateName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DestWac = null; } else {
      this.DestWac = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Distance = null; } else {
      this.Distance = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DistanceGroup = null; } else {
      this.DistanceGroup = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Div1Airport = null; } else {
      this.Div1Airport = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1AirportID = null; } else {
      this.Div1AirportID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1AirportSeqID = null; } else {
      this.Div1AirportSeqID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1LongestGTime = null; } else {
      this.Div1LongestGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Div1TailNum = null; } else {
      this.Div1TailNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1TotalGTime = null; } else {
      this.Div1TotalGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1WheelsOff = null; } else {
      this.Div1WheelsOff = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div1WheelsOn = null; } else {
      this.Div1WheelsOn = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Div2Airport = null; } else {
      this.Div2Airport = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2AirportID = null; } else {
      this.Div2AirportID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2AirportSeqID = null; } else {
      this.Div2AirportSeqID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2LongestGTime = null; } else {
      this.Div2LongestGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2TotalGTime = null; } else {
      this.Div2TotalGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Div2WheelsOn = null; } else {
      this.Div2WheelsOn = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivActualElapsedTime = null; } else {
      this.DivActualElapsedTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivAirportLandings = null; } else {
      this.DivAirportLandings = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivArrDelay = null; } else {
      this.DivArrDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivDistance = null; } else {
      this.DivDistance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Diverted = null; } else {
      this.Diverted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DivReachedDest = null; } else {
      this.DivReachedDest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FirstDepTime = null; } else {
      this.FirstDepTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FlightDate = null; } else {
      this.FlightDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FlightNum = null; } else {
      this.FlightNum = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Flights = null; } else {
      this.Flights = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LateAircraftDelay = null; } else {
      this.LateAircraftDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LongestAddGTime = null; } else {
      this.LongestAddGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Month = null; } else {
      this.Month = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NASDelay = null; } else {
      this.NASDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Origin = null; } else {
      this.Origin = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginAirportID = null; } else {
      this.OriginAirportID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginAirportSeqID = null; } else {
      this.OriginAirportSeqID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginCityMarketID = null; } else {
      this.OriginCityMarketID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OriginCityName = null; } else {
      this.OriginCityName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OriginState = null; } else {
      this.OriginState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginStateFips = null; } else {
      this.OriginStateFips = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OriginStateName = null; } else {
      this.OriginStateName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OriginWac = null; } else {
      this.OriginWac = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quarter = null; } else {
      this.Quarter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SecurityDelay = null; } else {
      this.SecurityDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TailNum = null; } else {
      this.TailNum = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiIn = null; } else {
      this.TaxiIn = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxiOut = null; } else {
      this.TaxiOut = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TotalAddGTime = null; } else {
      this.TotalAddGTime = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.UniqueCarrier = null; } else {
      this.UniqueCarrier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WeatherDelay = null; } else {
      this.WeatherDelay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WheelsOff = null; } else {
      this.WheelsOff = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WheelsOn = null; } else {
      this.WheelsOn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Year = null; } else {
      this.Year = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    On_Time_On_Time_Performance_2016_1 o = (On_Time_On_Time_Performance_2016_1) super.clone();
    o.FlightDate = (o.FlightDate != null) ? (java.sql.Date) o.FlightDate.clone() : null;
    return o;
  }

  public void clone0(On_Time_On_Time_Performance_2016_1 o) throws CloneNotSupportedException {
    o.FlightDate = (o.FlightDate != null) ? (java.sql.Date) o.FlightDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ActualElapsedTime", this.ActualElapsedTime);
    __sqoop$field_map.put("AirlineID", this.AirlineID);
    __sqoop$field_map.put("AirTime", this.AirTime);
    __sqoop$field_map.put("ArrDel15", this.ArrDel15);
    __sqoop$field_map.put("ArrDelay", this.ArrDelay);
    __sqoop$field_map.put("ArrDelayMinutes", this.ArrDelayMinutes);
    __sqoop$field_map.put("ArrivalDelayGroups", this.ArrivalDelayGroups);
    __sqoop$field_map.put("ArrTime", this.ArrTime);
    __sqoop$field_map.put("ArrTimeBlk", this.ArrTimeBlk);
    __sqoop$field_map.put("CancellationCode", this.CancellationCode);
    __sqoop$field_map.put("Cancelled", this.Cancelled);
    __sqoop$field_map.put("Carrier", this.Carrier);
    __sqoop$field_map.put("CarrierDelay", this.CarrierDelay);
    __sqoop$field_map.put("CRSArrTime", this.CRSArrTime);
    __sqoop$field_map.put("CRSDepTime", this.CRSDepTime);
    __sqoop$field_map.put("CRSElapsedTime", this.CRSElapsedTime);
    __sqoop$field_map.put("DayofMonth", this.DayofMonth);
    __sqoop$field_map.put("DayOfWeek", this.DayOfWeek);
    __sqoop$field_map.put("DepartureDelayGroups", this.DepartureDelayGroups);
    __sqoop$field_map.put("DepDel15", this.DepDel15);
    __sqoop$field_map.put("DepDelay", this.DepDelay);
    __sqoop$field_map.put("DepDelayMinutes", this.DepDelayMinutes);
    __sqoop$field_map.put("DepTime", this.DepTime);
    __sqoop$field_map.put("DepTimeBlk", this.DepTimeBlk);
    __sqoop$field_map.put("Dest", this.Dest);
    __sqoop$field_map.put("DestAirportID", this.DestAirportID);
    __sqoop$field_map.put("DestAirportSeqID", this.DestAirportSeqID);
    __sqoop$field_map.put("DestCityMarketID", this.DestCityMarketID);
    __sqoop$field_map.put("DestCityName", this.DestCityName);
    __sqoop$field_map.put("DestState", this.DestState);
    __sqoop$field_map.put("DestStateFips", this.DestStateFips);
    __sqoop$field_map.put("DestStateName", this.DestStateName);
    __sqoop$field_map.put("DestWac", this.DestWac);
    __sqoop$field_map.put("Distance", this.Distance);
    __sqoop$field_map.put("DistanceGroup", this.DistanceGroup);
    __sqoop$field_map.put("Div1Airport", this.Div1Airport);
    __sqoop$field_map.put("Div1AirportID", this.Div1AirportID);
    __sqoop$field_map.put("Div1AirportSeqID", this.Div1AirportSeqID);
    __sqoop$field_map.put("Div1LongestGTime", this.Div1LongestGTime);
    __sqoop$field_map.put("Div1TailNum", this.Div1TailNum);
    __sqoop$field_map.put("Div1TotalGTime", this.Div1TotalGTime);
    __sqoop$field_map.put("Div1WheelsOff", this.Div1WheelsOff);
    __sqoop$field_map.put("Div1WheelsOn", this.Div1WheelsOn);
    __sqoop$field_map.put("Div2Airport", this.Div2Airport);
    __sqoop$field_map.put("Div2AirportID", this.Div2AirportID);
    __sqoop$field_map.put("Div2AirportSeqID", this.Div2AirportSeqID);
    __sqoop$field_map.put("Div2LongestGTime", this.Div2LongestGTime);
    __sqoop$field_map.put("Div2TotalGTime", this.Div2TotalGTime);
    __sqoop$field_map.put("Div2WheelsOn", this.Div2WheelsOn);
    __sqoop$field_map.put("DivActualElapsedTime", this.DivActualElapsedTime);
    __sqoop$field_map.put("DivAirportLandings", this.DivAirportLandings);
    __sqoop$field_map.put("DivArrDelay", this.DivArrDelay);
    __sqoop$field_map.put("DivDistance", this.DivDistance);
    __sqoop$field_map.put("Diverted", this.Diverted);
    __sqoop$field_map.put("DivReachedDest", this.DivReachedDest);
    __sqoop$field_map.put("FirstDepTime", this.FirstDepTime);
    __sqoop$field_map.put("FlightDate", this.FlightDate);
    __sqoop$field_map.put("FlightNum", this.FlightNum);
    __sqoop$field_map.put("Flights", this.Flights);
    __sqoop$field_map.put("LateAircraftDelay", this.LateAircraftDelay);
    __sqoop$field_map.put("LongestAddGTime", this.LongestAddGTime);
    __sqoop$field_map.put("Month", this.Month);
    __sqoop$field_map.put("NASDelay", this.NASDelay);
    __sqoop$field_map.put("Origin", this.Origin);
    __sqoop$field_map.put("OriginAirportID", this.OriginAirportID);
    __sqoop$field_map.put("OriginAirportSeqID", this.OriginAirportSeqID);
    __sqoop$field_map.put("OriginCityMarketID", this.OriginCityMarketID);
    __sqoop$field_map.put("OriginCityName", this.OriginCityName);
    __sqoop$field_map.put("OriginState", this.OriginState);
    __sqoop$field_map.put("OriginStateFips", this.OriginStateFips);
    __sqoop$field_map.put("OriginStateName", this.OriginStateName);
    __sqoop$field_map.put("OriginWac", this.OriginWac);
    __sqoop$field_map.put("Quarter", this.Quarter);
    __sqoop$field_map.put("SecurityDelay", this.SecurityDelay);
    __sqoop$field_map.put("TailNum", this.TailNum);
    __sqoop$field_map.put("TaxiIn", this.TaxiIn);
    __sqoop$field_map.put("TaxiOut", this.TaxiOut);
    __sqoop$field_map.put("TotalAddGTime", this.TotalAddGTime);
    __sqoop$field_map.put("UniqueCarrier", this.UniqueCarrier);
    __sqoop$field_map.put("WeatherDelay", this.WeatherDelay);
    __sqoop$field_map.put("WheelsOff", this.WheelsOff);
    __sqoop$field_map.put("WheelsOn", this.WheelsOn);
    __sqoop$field_map.put("Year", this.Year);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ActualElapsedTime", this.ActualElapsedTime);
    __sqoop$field_map.put("AirlineID", this.AirlineID);
    __sqoop$field_map.put("AirTime", this.AirTime);
    __sqoop$field_map.put("ArrDel15", this.ArrDel15);
    __sqoop$field_map.put("ArrDelay", this.ArrDelay);
    __sqoop$field_map.put("ArrDelayMinutes", this.ArrDelayMinutes);
    __sqoop$field_map.put("ArrivalDelayGroups", this.ArrivalDelayGroups);
    __sqoop$field_map.put("ArrTime", this.ArrTime);
    __sqoop$field_map.put("ArrTimeBlk", this.ArrTimeBlk);
    __sqoop$field_map.put("CancellationCode", this.CancellationCode);
    __sqoop$field_map.put("Cancelled", this.Cancelled);
    __sqoop$field_map.put("Carrier", this.Carrier);
    __sqoop$field_map.put("CarrierDelay", this.CarrierDelay);
    __sqoop$field_map.put("CRSArrTime", this.CRSArrTime);
    __sqoop$field_map.put("CRSDepTime", this.CRSDepTime);
    __sqoop$field_map.put("CRSElapsedTime", this.CRSElapsedTime);
    __sqoop$field_map.put("DayofMonth", this.DayofMonth);
    __sqoop$field_map.put("DayOfWeek", this.DayOfWeek);
    __sqoop$field_map.put("DepartureDelayGroups", this.DepartureDelayGroups);
    __sqoop$field_map.put("DepDel15", this.DepDel15);
    __sqoop$field_map.put("DepDelay", this.DepDelay);
    __sqoop$field_map.put("DepDelayMinutes", this.DepDelayMinutes);
    __sqoop$field_map.put("DepTime", this.DepTime);
    __sqoop$field_map.put("DepTimeBlk", this.DepTimeBlk);
    __sqoop$field_map.put("Dest", this.Dest);
    __sqoop$field_map.put("DestAirportID", this.DestAirportID);
    __sqoop$field_map.put("DestAirportSeqID", this.DestAirportSeqID);
    __sqoop$field_map.put("DestCityMarketID", this.DestCityMarketID);
    __sqoop$field_map.put("DestCityName", this.DestCityName);
    __sqoop$field_map.put("DestState", this.DestState);
    __sqoop$field_map.put("DestStateFips", this.DestStateFips);
    __sqoop$field_map.put("DestStateName", this.DestStateName);
    __sqoop$field_map.put("DestWac", this.DestWac);
    __sqoop$field_map.put("Distance", this.Distance);
    __sqoop$field_map.put("DistanceGroup", this.DistanceGroup);
    __sqoop$field_map.put("Div1Airport", this.Div1Airport);
    __sqoop$field_map.put("Div1AirportID", this.Div1AirportID);
    __sqoop$field_map.put("Div1AirportSeqID", this.Div1AirportSeqID);
    __sqoop$field_map.put("Div1LongestGTime", this.Div1LongestGTime);
    __sqoop$field_map.put("Div1TailNum", this.Div1TailNum);
    __sqoop$field_map.put("Div1TotalGTime", this.Div1TotalGTime);
    __sqoop$field_map.put("Div1WheelsOff", this.Div1WheelsOff);
    __sqoop$field_map.put("Div1WheelsOn", this.Div1WheelsOn);
    __sqoop$field_map.put("Div2Airport", this.Div2Airport);
    __sqoop$field_map.put("Div2AirportID", this.Div2AirportID);
    __sqoop$field_map.put("Div2AirportSeqID", this.Div2AirportSeqID);
    __sqoop$field_map.put("Div2LongestGTime", this.Div2LongestGTime);
    __sqoop$field_map.put("Div2TotalGTime", this.Div2TotalGTime);
    __sqoop$field_map.put("Div2WheelsOn", this.Div2WheelsOn);
    __sqoop$field_map.put("DivActualElapsedTime", this.DivActualElapsedTime);
    __sqoop$field_map.put("DivAirportLandings", this.DivAirportLandings);
    __sqoop$field_map.put("DivArrDelay", this.DivArrDelay);
    __sqoop$field_map.put("DivDistance", this.DivDistance);
    __sqoop$field_map.put("Diverted", this.Diverted);
    __sqoop$field_map.put("DivReachedDest", this.DivReachedDest);
    __sqoop$field_map.put("FirstDepTime", this.FirstDepTime);
    __sqoop$field_map.put("FlightDate", this.FlightDate);
    __sqoop$field_map.put("FlightNum", this.FlightNum);
    __sqoop$field_map.put("Flights", this.Flights);
    __sqoop$field_map.put("LateAircraftDelay", this.LateAircraftDelay);
    __sqoop$field_map.put("LongestAddGTime", this.LongestAddGTime);
    __sqoop$field_map.put("Month", this.Month);
    __sqoop$field_map.put("NASDelay", this.NASDelay);
    __sqoop$field_map.put("Origin", this.Origin);
    __sqoop$field_map.put("OriginAirportID", this.OriginAirportID);
    __sqoop$field_map.put("OriginAirportSeqID", this.OriginAirportSeqID);
    __sqoop$field_map.put("OriginCityMarketID", this.OriginCityMarketID);
    __sqoop$field_map.put("OriginCityName", this.OriginCityName);
    __sqoop$field_map.put("OriginState", this.OriginState);
    __sqoop$field_map.put("OriginStateFips", this.OriginStateFips);
    __sqoop$field_map.put("OriginStateName", this.OriginStateName);
    __sqoop$field_map.put("OriginWac", this.OriginWac);
    __sqoop$field_map.put("Quarter", this.Quarter);
    __sqoop$field_map.put("SecurityDelay", this.SecurityDelay);
    __sqoop$field_map.put("TailNum", this.TailNum);
    __sqoop$field_map.put("TaxiIn", this.TaxiIn);
    __sqoop$field_map.put("TaxiOut", this.TaxiOut);
    __sqoop$field_map.put("TotalAddGTime", this.TotalAddGTime);
    __sqoop$field_map.put("UniqueCarrier", this.UniqueCarrier);
    __sqoop$field_map.put("WeatherDelay", this.WeatherDelay);
    __sqoop$field_map.put("WheelsOff", this.WheelsOff);
    __sqoop$field_map.put("WheelsOn", this.WheelsOn);
    __sqoop$field_map.put("Year", this.Year);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
