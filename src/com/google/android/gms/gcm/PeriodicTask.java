package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class PeriodicTask
  extends Task
{
  public static final Parcelable.Creator CREATOR = new PeriodicTask.1();
  protected long mFlexInSeconds = -1L;
  protected long mIntervalInSeconds = -1L;
  
  private PeriodicTask(Parcel paramParcel)
  {
    super(paramParcel);
    mIntervalInSeconds = paramParcel.readLong();
    mFlexInSeconds = Math.min(paramParcel.readLong(), mIntervalInSeconds);
  }
  
  private PeriodicTask(PeriodicTask.Builder paramBuilder)
  {
    super(paramBuilder);
    mIntervalInSeconds = PeriodicTask.Builder.zza(paramBuilder);
    mFlexInSeconds = Math.min(PeriodicTask.Builder.zzb(paramBuilder), mIntervalInSeconds);
  }
  
  public long getFlex()
  {
    return mFlexInSeconds;
  }
  
  public long getPeriod()
  {
    return mIntervalInSeconds;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putLong("period", mIntervalInSeconds);
    paramBundle.putLong("period_flex", mFlexInSeconds);
  }
  
  public String toString()
  {
    return super.toString() + " period=" + getPeriod() + " flex=" + getFlex();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(mIntervalInSeconds);
    paramParcel.writeLong(mFlexInSeconds);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.gcm.PeriodicTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */