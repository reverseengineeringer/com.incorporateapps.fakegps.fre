package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;
import com.google.android.gms.nearby.bootstrap.Device;

public class SendDataRequest
  implements SafeParcelable
{
  public static final zzf CREATOR = new zzf();
  private final byte[] data;
  final int versionCode;
  private final Device zzbaS;
  private final zzqg zzbaV;
  
  SendDataRequest(int paramInt, Device paramDevice, byte[] paramArrayOfByte, IBinder paramIBinder)
  {
    versionCode = paramInt;
    zzbaS = ((Device)zzx.zzz(paramDevice));
    data = ((byte[])zzx.zzz(paramArrayOfByte));
    zzx.zzz(paramIBinder);
    zzbaV = zzqg.zza.zzds(paramIBinder);
  }
  
  public int describeContents()
  {
    zzf localzzf = CREATOR;
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzbaV == null) {
      return null;
    }
    return zzbaV.asBinder();
  }
  
  public byte[] getData()
  {
    return data;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf localzzf = CREATOR;
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public Device zzEd()
  {
    return zzbaS;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.bootstrap.request.SendDataRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */