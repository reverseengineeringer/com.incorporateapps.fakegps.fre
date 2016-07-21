package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class OneoffTask
  extends Task
{
  public static final Parcelable.Creator CREATOR = new OneoffTask.1();
  private final long zzaLW;
  private final long zzaLX;
  
  private OneoffTask(Parcel paramParcel)
  {
    super(paramParcel);
    zzaLW = paramParcel.readLong();
    zzaLX = paramParcel.readLong();
  }
  
  private OneoffTask(OneoffTask.Builder paramBuilder)
  {
    super(paramBuilder);
    zzaLW = OneoffTask.Builder.zza(paramBuilder);
    zzaLX = OneoffTask.Builder.zzb(paramBuilder);
  }
  
  public long getWindowEnd()
  {
    return zzaLX;
  }
  
  public long getWindowStart()
  {
    return zzaLW;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putLong("window_start", zzaLW);
    paramBundle.putLong("window_end", zzaLX);
  }
  
  public String toString()
  {
    return super.toString() + " windowStart=" + getWindowStart() + " windowEnd=" + getWindowEnd();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(zzaLW);
    paramParcel.writeLong(zzaLX);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.gcm.OneoffTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */