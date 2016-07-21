package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;
import com.google.android.gms.nearby.bootstrap.request.zza;
import com.google.android.gms.nearby.bootstrap.request.zzb;
import com.google.android.gms.nearby.bootstrap.request.zzc;
import com.google.android.gms.nearby.bootstrap.request.zzd;
import com.google.android.gms.nearby.bootstrap.request.zze;
import com.google.android.gms.nearby.bootstrap.request.zzf;
import com.google.android.gms.nearby.bootstrap.request.zzg;
import com.google.android.gms.nearby.bootstrap.request.zzh;

public abstract class zzqh$zza
  extends Binder
  implements zzqh
{
  public static zzqh zzdt(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
    if ((localIInterface != null) && ((localIInterface instanceof zzqh))) {
      return (zzqh)localIInterface;
    }
    return new zzqh.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      if (paramParcel1.readInt() != 0) {
        localObject1 = StartScanRequest.CREATOR.zzfW(paramParcel1);
      }
      zza((StartScanRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = StopScanRequest.CREATOR.zzfX(paramParcel1);
      }
      zza((StopScanRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = EnableTargetRequest.CREATOR.zzfU(paramParcel1);
      }
      zza((EnableTargetRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DisableTargetRequest.CREATOR.zzfS(paramParcel1);
      }
      zza((DisableTargetRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      localObject1 = localObject5;
      if (paramParcel1.readInt() != 0) {
        localObject1 = ConnectRequest.CREATOR.zzfQ(paramParcel1);
      }
      zza((ConnectRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      localObject1 = localObject6;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DisconnectRequest.CREATOR.zzfT(paramParcel1);
      }
      zza((DisconnectRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      localObject1 = localObject7;
      if (paramParcel1.readInt() != 0) {
        localObject1 = SendDataRequest.CREATOR.zzfV(paramParcel1);
      }
      zza((SendDataRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      localObject1 = localObject8;
      if (paramParcel1.readInt() != 0) {
        localObject1 = ContinueConnectRequest.CREATOR.zzfR(paramParcel1);
      }
      zza((ContinueConnectRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      paramParcel1 = getToken();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
    zza(zzqg.zza.zzds(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqh.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */