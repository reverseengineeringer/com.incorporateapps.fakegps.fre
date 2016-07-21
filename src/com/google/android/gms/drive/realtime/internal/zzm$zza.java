package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

public abstract class zzm$zza
  extends Binder
  implements zzm
{
  public static zzm zzbo(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
    if ((localIInterface != null) && ((localIInterface instanceof zzm))) {
      return (zzm)localIInterface;
    }
    return new zzm.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str2 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject1 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    String str1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), zzn.zza.zzbp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(zzc.zza.zzbe(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 33: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzb(zzc.zza.zzbe(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 35: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzb(zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 40: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(zzl.zza.zzbn(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 45: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzc(zzc.zza.zzbe(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 46: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), paramParcel1.readInt(), zzn.zza.zzbp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), paramParcel1.readString(), zzf.zza.zzbh(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), zzl.zza.zzbn(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      str2 = paramParcel1.readString();
      localObject1 = str1;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zza(str2, (DataHolder)localObject1, zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), zzf.zza.zzbh(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), paramParcel1.readString(), zzg.zza.zzbi(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzb(paramParcel1.readString(), zzl.zza.zzbn(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzb(paramParcel1.readString(), zzn.zza.zzbp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString(), zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt(), zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), paramParcel1.readString(), zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzb(paramParcel1.readString(), zzf.zza.zzbh(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzc(paramParcel1.readString(), zzl.zza.zzbn(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      str1 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      localObject1 = str2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zza(str1, paramInt1, (DataHolder)localObject1, zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      str1 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zza(str1, paramInt1, (DataHolder)localObject1, zzg.zza.zzbi(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt(), zzg.zza.zzbi(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 37: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readInt(), zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (BeginCompoundOperationRequest)BeginCompoundOperationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((BeginCompoundOperationRequest)localObject1, zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 41: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((EndCompoundOperationRequest)localObject1, zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 22: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 23: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzb(zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 24: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzd(zzc.zza.zzbe(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 25: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zze(zzc.zza.zzbe(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 47: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        zza(bool, zzo.zza.zzbq(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 50: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readInt(), zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 26: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = localObject5;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ParcelableIndexReference)ParcelableIndexReference.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ParcelableIndexReference)localObject1, zzn.zza.zzbp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 27: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), zzk.zza.zzbm(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 28: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), paramParcel1.readInt(), zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 29: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzb(zzl.zza.zzbn(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 30: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readInt(), zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 31: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(zze.zza.zzbg(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 32: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(zzd.zza.zzbf(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 34: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(zzi.zza.zzbk(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 36: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(zzh.zza.zzbj(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 38: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zza(paramParcel1.readString(), zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 39: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzb(paramParcel1.readString(), zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 42: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzb(paramParcel1.readString(), paramParcel1.readString(), zzf.zza.zzbh(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 43: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      str1 = paramParcel1.readString();
      str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zza(str1, str2, (DataHolder)localObject1, zzj.zza.zzbl(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 44: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zztT();
      paramParcel2.writeNoException();
      return true;
    case 48: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = localObject6;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DriveId)DriveId.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DriveId)localObject1, zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 49: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      zzc(zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = localObject7;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((EndCompoundOperationRequest)localObject1, zzo.zza.zzbq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
    paramParcel1 = zzf(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
    paramParcel2.writeNoException();
    if (paramParcel1 != null)
    {
      paramParcel2.writeInt(1);
      paramParcel1.writeToParcel(paramParcel2, 1);
      return true;
    }
    paramParcel2.writeInt(0);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.zzm.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */