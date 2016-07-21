package com.google.android.gms.fitness.data;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

public class Session$Builder
{
  private String mName = null;
  private long zzRD = 0L;
  private long zzavV = 0L;
  private int zzawf = 4;
  private Application zzaws;
  private String zzaxk;
  private String zzaxl;
  private Long zzaxm;
  
  public Session build()
  {
    boolean bool2 = false;
    boolean bool1;
    StringBuilder localStringBuilder;
    if (zzRD > 0L)
    {
      bool1 = true;
      zzx.zza(bool1, "Start time should be specified.");
      if (zzavV != 0L)
      {
        bool1 = bool2;
        if (zzavV <= zzRD) {}
      }
      else
      {
        bool1 = true;
      }
      zzx.zza(bool1, "End time should be later than start time.");
      if (zzaxk == null)
      {
        localStringBuilder = new StringBuilder();
        if (mName != null) {
          break label111;
        }
      }
    }
    label111:
    for (String str = "";; str = mName)
    {
      zzaxk = (str + zzRD);
      return new Session(this, null);
      bool1 = false;
      break;
    }
  }
  
  public Builder setActiveTime(long paramLong, TimeUnit paramTimeUnit)
  {
    zzaxm = Long.valueOf(paramTimeUnit.toMillis(paramLong));
    return this;
  }
  
  public Builder setActivity(String paramString)
  {
    return zzfa(FitnessActivities.zzdm(paramString));
  }
  
  public Builder setDescription(String paramString)
  {
    if (paramString.length() <= 1000) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Session description cannot exceed %d characters", new Object[] { Integer.valueOf(1000) });
      zzaxl = paramString;
      return this;
    }
  }
  
  public Builder setEndTime(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong >= 0L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "End time should be positive.");
      zzavV = paramTimeUnit.toMillis(paramLong);
      return this;
    }
  }
  
  public Builder setIdentifier(String paramString)
  {
    if ((paramString != null) && (TextUtils.getTrimmedLength(paramString) > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      zzaxk = paramString;
      return this;
    }
  }
  
  public Builder setName(String paramString)
  {
    if (paramString.length() <= 100) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Session name cannot exceed %d characters", new Object[] { Integer.valueOf(100) });
      mName = paramString;
      return this;
    }
  }
  
  public Builder setStartTime(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Start time should be positive.");
      zzRD = paramTimeUnit.toMillis(paramLong);
      return this;
    }
  }
  
  public Builder zzfa(int paramInt)
  {
    zzawf = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.Session.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */