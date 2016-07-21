package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

class zzs
  implements Logger
{
  private boolean zzPk;
  private int zzRB = 2;
  
  public void error(Exception paramException) {}
  
  public void error(String paramString) {}
  
  public int getLogLevel()
  {
    return zzRB;
  }
  
  public void info(String paramString) {}
  
  public void setLogLevel(int paramInt)
  {
    zzRB = paramInt;
    if (!zzPk)
    {
      Log.i((String)zzy.zzRL.get(), "Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + (String)zzy.zzRL.get() + " DEBUG");
      zzPk = true;
    }
  }
  
  public void verbose(String paramString) {}
  
  public void warn(String paramString) {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */