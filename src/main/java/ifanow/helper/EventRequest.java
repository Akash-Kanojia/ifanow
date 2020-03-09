package ifanow.helper;

import java.sql.Date;

public class EventRequest {
	public Integer userid;
	public String latlong, noun, verb, timespent;
	public Date ts;
	public Properties properties;
	
	public class Properties {
		public String bank, mode;
		public Integer merchantid;
		public Float value;
	}
}
