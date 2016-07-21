package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;

public class EventParams
  implements SafeParcelable, Iterable
{
  public static final zzj CREATOR = new zzj();
  public final int versionCode;
  private final Bundle zzaVS;
  
  EventParams(int paramInt, Bundle paramBundle)
  {
    versionCode = paramInt;
    zzaVS = paramBundle;
  }
  
  EventParams(Bundle paramBundle)
  {
    zzx.zzz(paramBundle);
    zzaVS = paramBundle;
    versionCode = 1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  Object get(String paramString)
  {
    return zzaVS.get(paramString);
  }
  
  public Iterator iterator()
  {
    return new EventParams.1(this);
  }
  
  public int size()
  {
    return zzaVS.size();
  }
  
  public String toString()
  {
    return zzaVS.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public Bundle zzCC()
  {
    return new Bundle(zzaVS);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.EventParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */