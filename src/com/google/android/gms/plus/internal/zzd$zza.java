package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zze;
import com.google.android.gms.common.server.zza;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public static zzd zzdR(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
    if ((localIInterface != null) && ((localIInterface instanceof zzd))) {
      return (zzd)localIInterface;
    }
    return new zzd.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = null;
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.plus.internal.IPlusService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zza(zzb.zza.zzdP(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zza(zzb.zza.zzdP(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zzb(zzb.zza.zzdP(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = SafeParcelResponse.CREATOR.zzaE(paramParcel1);; paramParcel1 = null)
      {
        zza(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      paramParcel1 = getAccountName();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zzEY();
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zza(zzb.zza.zzdP(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label474;
        }
      }
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((zzb)localObject2, (Uri)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((zzb)localObject2, paramInt1, str, (Uri)localObject1, paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      localObject2 = zza(zzb.zza.zzdP(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject1;
      if (localObject2 != null) {
        paramParcel1 = ((zzq)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zzfG(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zzc(zzb.zza.zzdP(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zzb(zzb.zza.zzdP(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 34: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zza(zzb.zza.zzdP(paramParcel1.readStrongBinder()), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      return true;
    case 40: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zzd(zzb.zza.zzdP(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 41: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      paramParcel1 = getAuthCode();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 42: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      boolean bool = zzEZ();
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        return true;
      }
    case 43: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      paramParcel1 = zzmR();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 44: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      zze(zzb.zza.zzdP(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 45: 
      label474:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
      localObject1 = str;
      if (paramParcel1.readInt() != 0) {
        localObject1 = SafeParcelResponse.CREATOR.zzaE(paramParcel1);
      }
      zza((zzb)localObject2, (SafeParcelResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
    str = paramParcel1.readString();
    if (paramParcel1.readInt() != 0) {}
    for (localObject1 = FavaDiagnosticsEntity.CREATOR.zzaw(paramParcel1);; localObject1 = null)
    {
      if (paramParcel1.readInt() != 0) {
        localObject2 = FavaDiagnosticsEntity.CREATOR.zzaw(paramParcel1);
      }
      zza(str, (FavaDiagnosticsEntity)localObject1, (FavaDiagnosticsEntity)localObject2);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.zzd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */