package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzx;

public abstract class WriteAwareParcelable
  implements Parcelable
{
  private volatile transient boolean zzapw = false;
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!zzsT()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzab(bool);
      zzapw = true;
      zzJ(paramParcel, paramInt);
      return;
    }
  }
  
  protected abstract void zzJ(Parcel paramParcel, int paramInt);
  
  public final boolean zzsT()
  {
    return zzapw;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.WriteAwareParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */