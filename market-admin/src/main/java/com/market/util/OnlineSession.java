package market.util;

public final class OnlineSession {  
    
    
    /** 
     * 客户计算机的ip. 
     */  
    private String ip = null;  
    /** 
     * 客户登录名. 
     */  
    private String loginId = null;  
    /** 
     * 客户登录系统时间. 
     */  
    private String onlineTime = null;  
      private String password=null;
    /** 
     * 构造器. 
     * @param ip 
     * @param loginId 
     * @param onlineTime 
     */  
    public OnlineSession(String ip,String loginId,String onlineTime,String password){  
        this.ip=ip;  
        this.loginId=loginId;  
        this.onlineTime=onlineTime;  
        this.password=password;
    }  
      
    /** 
     * @return Returns the ip. 
     */  
    public String getIp() {  
        return ip;  
    }  
    public String getPassword() {
		return password;
	}

	public void setPassword(String Password) {
		this.password = password;
	}

	/** 
     * @param ip The ip to set. 
     */  
    public void setIp(String ip) {  
        this.ip = ip;  
    }  
    /** 
     * @return Returns the loginId. 
     */  
    public String getLoginId() {  
        return loginId;  
    }  
    /** 
     * @param loginId The loginId to set. 
     */  
    public void setLoginId(String loginId) {  
        this.loginId = loginId;  
    }  
    /** 
     * @return Returns the onlineTime. 
     */  
    public String getOnlineTime() {  
        return onlineTime;  
    }  
    /** 
     * @param onlineTime The onlineTime to set. 
     */  
    public void setOnlineTime(String onlineTime) {  
        this.onlineTime = onlineTime;  
    }  
}  
