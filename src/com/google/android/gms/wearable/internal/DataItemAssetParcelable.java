package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.DataItemAsset;

public class DataItemAssetParcelable
  implements SafeParcelable, DataItemAsset
{
  public static final Parcelable.Creator CREATOR = new zzab();
  final int mVersionCode;
  private final String zzvs;
  private final String zzyv;
  
  DataItemAssetParcelable(int paramInt, String paramString1, String paramString2)
  {
    mVersionCode = paramInt;
    zzyv = paramString1;
    zzvs = paramString2;
  }
  
  public DataItemAssetParcelable(DataItemAsset paramDataItemAsset)
  {
    mVersionCode = 1;
    zzyv = ((String)zzx.zzz(paramDataItemAsset.getId()));
    zzvs = ((String)zzx.zzz(paramDataItemAsset.getDataItemKey()));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDataItemKey()
  {
    return zzvs;
  }
  
  public String getId()
  {
    return zzyv;
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataItemAssetParcelable[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (zzyv == null) {
      localStringBuilder.append(",noid");
    }
    for (;;)
    {
      localStringBuilder.append(", key=");
      localStringBuilder.append(zzvs);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      localStringBuilder.append(zzyv);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzab.zza(this, paramParcel, paramInt);
  }
  
  public DataItemAsset zzIL()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.DataItemAssetParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */