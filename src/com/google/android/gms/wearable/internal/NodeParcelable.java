package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

public class NodeParcelable
  implements SafeParcelable, Node
{
  public static final Parcelable.Creator CREATOR = new zzbc();
  final int mVersionCode;
  private final String zzWQ;
  private final int zzbsY;
  private final boolean zzbsZ;
  private final String zzyv;
  
  NodeParcelable(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzyv = paramString1;
    zzWQ = paramString2;
    zzbsY = paramInt2;
    zzbsZ = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof NodeParcelable)) {
      return false;
    }
    return zzyv.equals(zzyv);
  }
  
  public String getDisplayName()
  {
    return zzWQ;
  }
  
  public int getHopCount()
  {
    return zzbsY;
  }
  
  public String getId()
  {
    return zzyv;
  }
  
  public int hashCode()
  {
    return zzyv.hashCode();
  }
  
  public boolean isNearby()
  {
    return zzbsZ;
  }
  
  public String toString()
  {
    return "Node{" + zzWQ + ", id=" + zzyv + ", hops=" + zzbsY + ", isNearby=" + zzbsZ + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.NodeParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */