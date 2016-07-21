package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zznr;
import java.util.Collections;
import java.util.List;

public class BleDevice
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final String mName;
  private final int mVersionCode;
  private final String zzawc;
  private final List zzawd;
  private final List zzawe;
  
  BleDevice(int paramInt, String paramString1, String paramString2, List paramList1, List paramList2)
  {
    mVersionCode = paramInt;
    zzawc = paramString1;
    mName = paramString2;
    zzawd = Collections.unmodifiableList(paramList1);
    zzawe = Collections.unmodifiableList(paramList2);
  }
  
  private boolean zza(BleDevice paramBleDevice)
  {
    return (mName.equals(mName)) && (zzawc.equals(zzawc)) && (zznr.zza(zzawd, zzawd)) && (zznr.zza(zzawe, zzawe));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof BleDevice)) && (zza((BleDevice)paramObject)));
  }
  
  public String getAddress()
  {
    return zzawc;
  }
  
  public List getDataTypes()
  {
    return zzawe;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public List getSupportedProfiles()
  {
    return zzawd;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { mName, zzawc, zzawd, zzawe });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("name", mName).zzg("address", zzawc).zzg("dataTypes", zzawe).zzg("supportedProfiles", zzawd).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.BleDevice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */