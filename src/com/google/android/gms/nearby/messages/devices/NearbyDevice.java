package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.Arrays;

public class NearbyDevice
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  private static final NearbyDeviceId[] zzbcb = new NearbyDeviceId[0];
  private static final String[] zzbcc = new String[0];
  public static final NearbyDevice zzbcd = new NearbyDevice("", zzbcb, zzbcc);
  final int mVersionCode;
  private final String zzF;
  private final NearbyDeviceId zzbce;
  private final String zzbcf;
  private final NearbyDeviceId[] zzbcg;
  private final String[] zzbch;
  
  NearbyDevice(int paramInt, NearbyDeviceId paramNearbyDeviceId, String paramString1, String paramString2, NearbyDeviceId[] paramArrayOfNearbyDeviceId, String[] paramArrayOfString)
  {
    mVersionCode = ((Integer)zzx.zzz(Integer.valueOf(paramInt))).intValue();
    paramNearbyDeviceId = paramString2;
    if (paramString2 == null) {
      paramNearbyDeviceId = "";
    }
    zzbcf = paramNearbyDeviceId;
    paramNearbyDeviceId = paramArrayOfNearbyDeviceId;
    if (paramArrayOfNearbyDeviceId == null) {
      paramNearbyDeviceId = zzbcb;
    }
    zzbcg = paramNearbyDeviceId;
    paramNearbyDeviceId = paramArrayOfString;
    if (paramArrayOfString == null) {
      paramNearbyDeviceId = zzbcc;
    }
    zzbch = paramNearbyDeviceId;
    if (zzbcg.length == 0)
    {
      paramNearbyDeviceId = NearbyDeviceId.zzbcl;
      zzbce = paramNearbyDeviceId;
      if (zzbch.length != 0) {
        break label114;
      }
    }
    label114:
    for (paramNearbyDeviceId = null;; paramNearbyDeviceId = zzbch[0])
    {
      zzF = paramNearbyDeviceId;
      return;
      paramNearbyDeviceId = zzbcg[0];
      break;
    }
  }
  
  public NearbyDevice(String paramString, NearbyDeviceId[] paramArrayOfNearbyDeviceId, String[] paramArrayOfString)
  {
    this(1, null, null, paramString, paramArrayOfNearbyDeviceId, paramArrayOfString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof NearbyDevice)) {
      return false;
    }
    paramObject = (NearbyDevice)paramObject;
    return zzw.equal(zzbcf, zzbcf);
  }
  
  public String getUrl()
  {
    if (zzbch.length == 0) {
      return null;
    }
    return zzbch[0];
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzbcf });
  }
  
  public String toString()
  {
    return "NearbyDevice{deviceHandle=" + zzbcf + ", ids=" + Arrays.toString(zzbcg) + ", urls=" + Arrays.toString(zzbch) + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public NearbyDeviceId[] zzEA()
  {
    return zzbcg;
  }
  
  public String[] zzEB()
  {
    return zzbch;
  }
  
  public String zzEC()
  {
    return zzbcf;
  }
  
  public NearbyDeviceId zzEz()
  {
    if (zzbcg.length == 0) {
      return NearbyDeviceId.zzbcl;
    }
    return zzbcg[0];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.devices.NearbyDevice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */