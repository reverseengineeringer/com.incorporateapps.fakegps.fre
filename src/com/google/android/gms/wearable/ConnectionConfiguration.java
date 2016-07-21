package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class ConnectionConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzg();
  private final String mName;
  final int mVersionCode;
  private boolean zzTb;
  private final int zzabB;
  private final int zzapo;
  private final String zzawc;
  private final boolean zzbqY;
  private String zzbqZ;
  private boolean zzbra;
  private String zzbrb;
  
  ConnectionConfiguration(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, String paramString3, boolean paramBoolean3, String paramString4)
  {
    mVersionCode = paramInt1;
    mName = paramString1;
    zzawc = paramString2;
    zzabB = paramInt2;
    zzapo = paramInt3;
    zzbqY = paramBoolean1;
    zzTb = paramBoolean2;
    zzbqZ = paramString3;
    zzbra = paramBoolean3;
    zzbrb = paramString4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ConnectionConfiguration)) {}
    do
    {
      return false;
      paramObject = (ConnectionConfiguration)paramObject;
    } while ((!zzw.equal(Integer.valueOf(mVersionCode), Integer.valueOf(mVersionCode))) || (!zzw.equal(mName, mName)) || (!zzw.equal(zzawc, zzawc)) || (!zzw.equal(Integer.valueOf(zzabB), Integer.valueOf(zzabB))) || (!zzw.equal(Integer.valueOf(zzapo), Integer.valueOf(zzapo))) || (!zzw.equal(Boolean.valueOf(zzbqY), Boolean.valueOf(zzbqY))) || (!zzw.equal(Boolean.valueOf(zzbra), Boolean.valueOf(zzbra))));
    return true;
  }
  
  public String getAddress()
  {
    return zzawc;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public String getNodeId()
  {
    return zzbrb;
  }
  
  public int getRole()
  {
    return zzapo;
  }
  
  public int getType()
  {
    return zzabB;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(mVersionCode), mName, zzawc, Integer.valueOf(zzabB), Integer.valueOf(zzapo), Boolean.valueOf(zzbqY), Boolean.valueOf(zzbra) });
  }
  
  public boolean isConnected()
  {
    return zzTb;
  }
  
  public boolean isEnabled()
  {
    return zzbqY;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ConnectionConfiguration[ ");
    localStringBuilder.append("mName=" + mName);
    localStringBuilder.append(", mAddress=" + zzawc);
    localStringBuilder.append(", mType=" + zzabB);
    localStringBuilder.append(", mRole=" + zzapo);
    localStringBuilder.append(", mEnabled=" + zzbqY);
    localStringBuilder.append(", mIsConnected=" + zzTb);
    localStringBuilder.append(", mPeerNodeId=" + zzbqZ);
    localStringBuilder.append(", mBtlePriority=" + zzbra);
    localStringBuilder.append(", mNodeId=" + zzbrb);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public String zzIt()
  {
    return zzbqZ;
  }
  
  public boolean zzIu()
  {
    return zzbra;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.ConnectionConfiguration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */