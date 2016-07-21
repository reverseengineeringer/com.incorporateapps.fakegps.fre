package com.google.android.gms.gcm;

import android.os.Bundle;

public class PeriodicTask$Builder
  extends Task.Builder
{
  private long zzaMa = -1L;
  private long zzaMb = -1L;
  
  public PeriodicTask$Builder()
  {
    isPersisted = true;
  }
  
  public PeriodicTask build()
  {
    checkConditions();
    return new PeriodicTask(this, null);
  }
  
  protected void checkConditions()
  {
    super.checkConditions();
    if (zzaMa == -1L) {
      throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
    }
    if (zzaMa <= 0L) {
      throw new IllegalArgumentException("Period set cannot be less or equal to 0: " + zzaMa);
    }
    if (zzaMb == -1L) {
      zzaMb = (((float)zzaMa * 0.1F));
    }
    while (zzaMb <= zzaMa) {
      return;
    }
    zzaMb = zzaMa;
  }
  
  public Builder setExtras(Bundle paramBundle)
  {
    extras = paramBundle;
    return this;
  }
  
  public Builder setFlex(long paramLong)
  {
    zzaMb = paramLong;
    return this;
  }
  
  public Builder setPeriod(long paramLong)
  {
    zzaMa = paramLong;
    return this;
  }
  
  public Builder setPersisted(boolean paramBoolean)
  {
    isPersisted = paramBoolean;
    return this;
  }
  
  public Builder setRequiredNetwork(int paramInt)
  {
    requiredNetworkState = paramInt;
    return this;
  }
  
  public Builder setRequiresCharging(boolean paramBoolean)
  {
    requiresCharging = paramBoolean;
    return this;
  }
  
  public Builder setService(Class paramClass)
  {
    gcmTaskService = paramClass.getName();
    return this;
  }
  
  public Builder setTag(String paramString)
  {
    tag = paramString;
    return this;
  }
  
  public Builder setUpdateCurrent(boolean paramBoolean)
  {
    updateCurrent = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.gcm.PeriodicTask.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */