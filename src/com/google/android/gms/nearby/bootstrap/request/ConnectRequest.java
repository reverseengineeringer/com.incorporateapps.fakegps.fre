package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqe;
import com.google.android.gms.internal.zzqe.zza;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzqf.zza;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;
import com.google.android.gms.nearby.bootstrap.Device;

public class ConnectRequest
  implements SafeParcelable
{
  public static final zza CREATOR = new zza();
  private final String description;
  private final String name;
  private final long timeoutMillis;
  final int versionCode;
  private final byte zzbaR;
  private final Device zzbaS;
  private final zzqe zzbaT;
  private final zzqf zzbaU;
  private final zzqg zzbaV;
  private final String zzbaW;
  private final byte zzbaX;
  
  ConnectRequest(int paramInt, Device paramDevice, String paramString1, String paramString2, byte paramByte1, long paramLong, String paramString3, byte paramByte2, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3)
  {
    versionCode = paramInt;
    zzbaS = ((Device)zzx.zzz(paramDevice));
    name = zzx.zzcM(paramString1);
    description = ((String)zzx.zzz(paramString2));
    zzbaR = paramByte1;
    timeoutMillis = paramLong;
    zzbaX = paramByte2;
    zzbaW = paramString3;
    zzx.zzz(paramIBinder1);
    zzbaT = zzqe.zza.zzdq(paramIBinder1);
    zzx.zzz(paramIBinder2);
    zzbaU = zzqf.zza.zzdr(paramIBinder2);
    zzx.zzz(paramIBinder3);
    zzbaV = zzqg.zza.zzds(paramIBinder3);
  }
  
  public int describeContents()
  {
    zza localzza = CREATOR;
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzbaV == null) {
      return null;
    }
    return zzbaV.asBinder();
  }
  
  public String getDescription()
  {
    return description;
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getToken()
  {
    return zzbaW;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza localzza = CREATOR;
    zza.zza(this, paramParcel, paramInt);
  }
  
  public byte zzEb()
  {
    return zzbaR;
  }
  
  public Device zzEd()
  {
    return zzbaS;
  }
  
  public long zzEe()
  {
    return timeoutMillis;
  }
  
  public byte zzEf()
  {
    return zzbaX;
  }
  
  public IBinder zzEg()
  {
    if (zzbaT == null) {
      return null;
    }
    return zzbaT.asBinder();
  }
  
  public IBinder zzEh()
  {
    if (zzbaU == null) {
      return null;
    }
    return zzbaU.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.bootstrap.request.ConnectRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */