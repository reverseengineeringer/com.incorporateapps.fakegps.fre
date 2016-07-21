package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CapabilityInfoParcelable
  implements SafeParcelable, CapabilityInfo
{
  public static final Parcelable.Creator CREATOR = new zzk();
  private final String mName;
  final int mVersionCode;
  private Set zzbrS;
  private final List zzbrV;
  private final Object zzpV = new Object();
  
  CapabilityInfoParcelable(int paramInt, String paramString, List paramList)
  {
    mVersionCode = paramInt;
    mName = paramString;
    zzbrV = paramList;
    zzbrS = null;
    zzIH();
  }
  
  private void zzIH()
  {
    zzx.zzz(mName);
    zzx.zzz(zzbrV);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (CapabilityInfoParcelable)paramObject;
      if (mVersionCode != mVersionCode) {
        return false;
      }
      if (mName != null)
      {
        if (mName.equals(mName)) {}
      }
      else {
        while (mName != null) {
          return false;
        }
      }
      if (zzbrV == null) {
        break;
      }
    } while (zzbrV.equals(zzbrV));
    for (;;)
    {
      return false;
      if (zzbrV == null) {
        break;
      }
    }
  }
  
  public String getName()
  {
    return mName;
  }
  
  public Set getNodes()
  {
    synchronized (zzpV)
    {
      if (zzbrS == null) {
        zzbrS = new HashSet(zzbrV);
      }
      Set localSet = zzbrS;
      return localSet;
    }
  }
  
  public int hashCode()
  {
    int j = 0;
    int k = mVersionCode;
    if (mName != null) {}
    for (int i = mName.hashCode();; i = 0)
    {
      if (zzbrV != null) {
        j = zzbrV.hashCode();
      }
      return (i + k * 31) * 31 + j;
    }
  }
  
  public String toString()
  {
    return "CapabilityInfo{" + mName + ", " + zzbrV + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
  
  public List zzII()
  {
    return zzbrV;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.CapabilityInfoParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */