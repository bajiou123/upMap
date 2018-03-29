package com.dinstar.snmp.util;

 
public enum AlarmDescEnum {
	s100116("server is disabled by administrator",100116),
	s100117("server license authentication fail",100117),
	s100118("server license will be expired in one week",100118),
	s100119("server license is expired",100119),
	s100120("server license uses 120% max sim cards",100120),
	s100121("server license reaches max sim cards!",100121),
	s100122("server hbm features disabled",100122),
	s100123("server comm fail",100123),
	s100124("server cpu overload",100124),
	s100125("server cpu high",100125),
	s100126("server mem high",100126),
	l100127("local server comm fail",100127),
	s100128("server node comm fail",100128),
	s100129("server di	sk high",100129),
	d100316("domain disabled by administrator",100316),
	d100317("domain license authentification fail",100317),
	d100318("domain license will be expired in one week",100318),
	d100319("domain license is expired",100319),
	d100320("domain license uses 120% max sim cards",100320),
	d100321("domain license reaches max sim cards!",100321),
	d100322("domain license turn off hbm features",100322),
	s100416("sim card blocked",100416),
	s100417("sim card no balance",100417),
	s100418("sim card low balance",100418),
	s100516("site balance low",100516),
	s100517("site balance no balance",100517),
	d201000("device cpu overload",201000),
	d201001("device cpu high",201001),
	d201002("device mem high",201002),
	d201003("device aosmem high",201003),
	d201006("DEV_AUTO_CHECK",201006),
	d201016("device connection loss",201016),
	d201017("device register fail by authentication",201017),
	d201018("device has long delay in ping test",201018),
	d201019("device has low asr in 15 min statistics",201019),
	d201020("device valid days are less than 7",201020),
	d201021("device license is expired",201021),
	i201022("Ip Conflict",201022),
	m201023("Mac Conflict",201023),
	s201024("sip server comm fail",201024),
	c201025("cpu overload",201025),
	l201026("locked device connection loss",201026),
	t201027("the caps low",201027),
	l202300("line physical fault",202300),
	ls202301("line fxo lost",202301),
	l202302("line card fault",202302),
	l202303("line voltage abnormal",202303),
	l202304("line current abnormal",202304),
	l202305("line sip register fail",202305),
	l202306("line rtp single loss",202306),
	l202307("line rtp packet loss",202307),
	l202308("line rtp jitter overflow",202308),
	l202309("line rtp delay high",202309),
	s202400("signal loss",202400),
	l202401("local frame loss",202401),
	l202402("local multiple frame loss",202402),
	n202403("no multiple frame",202403),
	r202404("remote frame alarm",202404),
	a202405("alarm indication",202405),
	l202406("link down",202406),
	l202500("link down",202500),
	l202600("link down",202600),
	d203100("dsp cpu overload",203100),
	d203101("dsp chip fault",203101),
	l203200("link-0 receive sio",203200),
	l203201("link-0 receive sios",203201),
	l203202("link-0 receive msu timeout",203202),
	l203203("link-0 receive fisu timeout",203203),
	l203204("link-1 receive sio",203204),
	l203205("link-1 receive sios",203205),
	l203206("link-1 receive msu timeout",203206),
	l203207("link-1 receive fisu timeout",203207),
	r203300("receive disc",203300),
	u203301("u frame timeout",203301),
	c203302("c/r error",203302),
	s203400("sip option timeout",203400),
	s203401("sip register fail",203401);

	private String alarmName;
	private int index;
	public String getAlarmName() {
		return alarmName;
	}

	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private AlarmDescEnum(String alarmName, int index) {  
        this.alarmName = alarmName;  
        this.index = index;  
    }   
	
    public static String getName(int index) {  
        for (AlarmDescEnum c : AlarmDescEnum.values()) {  
            if (c.getIndex() == index) {  
                return c.alarmName;  
            }  
        }  
        return null;  
    }   
}
