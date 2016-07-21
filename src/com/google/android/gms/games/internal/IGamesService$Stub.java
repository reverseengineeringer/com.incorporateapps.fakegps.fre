package com.google.android.gms.games.internal;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.multiplayer.InvitationClusterCreator;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.internal.request.GameRequestClusterCreator;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.video.VideoConfiguration;

public abstract class IGamesService$Stub
  extends Binder
  implements IGamesService
{
  public IGamesService$Stub()
  {
    attachInterface(this, "com.google.android.gms.games.internal.IGamesService");
  }
  
  public static IGamesService zzbY(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
    if ((localIInterface != null) && ((localIInterface instanceof IGamesService))) {
      return (IGamesService)localIInterface;
    }
    return new IGamesService.Stub.Proxy(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject1 = null;
    boolean bool1 = false;
    boolean bool8 = false;
    boolean bool9 = false;
    boolean bool3 = false;
    boolean bool5 = false;
    boolean bool10 = false;
    int i = 0;
    boolean bool11 = false;
    boolean bool12 = false;
    boolean bool13 = false;
    boolean bool14 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool4 = false;
    boolean bool15 = false;
    boolean bool16 = false;
    boolean bool17 = false;
    boolean bool18 = false;
    boolean bool19 = false;
    boolean bool20 = false;
    boolean bool21 = false;
    boolean bool22 = false;
    boolean bool23 = false;
    boolean bool24 = false;
    boolean bool25 = false;
    int j = 0;
    boolean bool26 = false;
    boolean bool27 = false;
    boolean bool28 = false;
    boolean bool29 = false;
    boolean bool30 = false;
    boolean bool31 = false;
    boolean bool32 = false;
    boolean bool33 = false;
    boolean bool34 = false;
    boolean bool35 = false;
    boolean bool36 = false;
    boolean bool37 = false;
    boolean bool2 = false;
    Object localObject4;
    label3648:
    label3725:
    label4485:
    label4812:
    label4861:
    label4867:
    label6254:
    label6929:
    label6934:
    label7034:
    label7119:
    label8097:
    label8103:
    label8343:
    label8505:
    label8714:
    label8791:
    label9623:
    String str;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.games.internal.IGamesService");
      return true;
    case 5001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzF(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwK();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 5004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzoi();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((IBinder)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzwR();
      paramParcel2.writeNoException();
      return true;
    case 5007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzww();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 5064: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzdK(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 5065: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzE(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5012: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwT();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 5013: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwU();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5014: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5015: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        zza((IGamesCallbacks)localObject1, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
      }
    case 5016: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5017: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzb(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5018: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzb(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5019: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      i = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        zza((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, paramInt2, i, bool1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5020: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      i = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        zzb((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, paramInt2, i, bool1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5021: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((IGamesCallbacks)localObject2, (Bundle)localObject1, paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
    case 5022: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzc(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5023: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((IGamesCallbacks)localObject1, (String)localObject2, (IBinder)localObject3, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5024: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzb((IGamesCallbacks)localObject1, (String)localObject2, (IBinder)localObject3, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5025: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      localObject3 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, (IBinder)localObject3, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5026: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzd(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5027: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zze(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5028: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzr(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5029: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzq(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5058: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5059: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzG(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5030: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readStrongBinder();
      paramInt1 = paramParcel1.readInt();
      localObject4 = paramParcel1.createStringArray();
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject2, (IBinder)localObject3, paramInt1, (String[])localObject4, (Bundle)localObject1, bool1, paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5031: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readStrongBinder();
      localObject3 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        zza((IGamesCallbacks)localObject1, (IBinder)localObject2, (String)localObject3, bool1, paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      }
    case 5032: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzc(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5033: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 5034: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = zzb(paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 5035: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzdL(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 5036: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzgt(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5037: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzd(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5038: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5039: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      i = paramParcel1.readInt();
      bool1 = bool8;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, paramInt1, paramInt2, i, bool1);
      paramParcel2.writeNoException();
      return true;
    case 5040: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      i = paramParcel1.readInt();
      bool1 = bool9;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzb((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, paramInt1, paramInt2, i, bool1);
      paramParcel2.writeNoException();
      return true;
    case 5041: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzb(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5042: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zze(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5043: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzf(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5044: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label3648;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        zza((IGamesCallbacks)localObject1, paramInt1, paramInt2, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
      }
    case 5045: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label3725;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        zza((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
      }
    case 5046: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        bool2 = bool3;
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        zzb((IGamesCallbacks)localObject1, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
      }
    case 5047: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzf(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5048: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        bool2 = bool5;
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        zzc((IGamesCallbacks)localObject1, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
      }
    case 5049: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzg(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5050: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzdM(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5051: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzd(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5052: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzg(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5053: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzh(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5060: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = zzdN(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 5054: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      bool1 = bool10;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject1, (String)localObject2, bool1);
      paramParcel2.writeNoException();
      return true;
    case 5061: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzi(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5055: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzt(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5067: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      bool1 = zzwV();
      paramParcel2.writeNoException();
      paramInt1 = i;
      if (bool1) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    case 5068: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      bool1 = bool11;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzai(bool1);
      paramParcel2.writeNoException();
      return true;
    case 5056: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzh(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5057: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzj(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5062: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzi(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5063: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool12;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((IGamesCallbacks)localObject1, bool1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5066: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzdO(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5501: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label4485;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        zzb((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
      }
    case 5502: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwW();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 6001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool13;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 6002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      bool1 = bool14;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, bool1);
      paramParcel2.writeNoException();
      return true;
    case 6003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        bool2 = bool6;
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        zzd((IGamesCallbacks)localObject1, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
      }
    case 6004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        bool2 = bool7;
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        zze((IGamesCallbacks)localObject1, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
      }
    case 6501: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label4861;
        }
        bool2 = true;
        if (paramParcel1.readInt() == 0) {
          break label4867;
        }
      }
      for (bool3 = true;; bool3 = false)
      {
        if (paramParcel1.readInt() != 0) {
          bool4 = true;
        }
        zza((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, bool1, bool2, bool3, bool4);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
        bool2 = false;
        break label4812;
      }
    case 6502: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      bool1 = bool15;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzb((IGamesCallbacks)localObject1, (String)localObject2, bool1);
      paramParcel2.writeNoException();
      return true;
    case 6503: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool16;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzb((IGamesCallbacks)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 6504: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      bool1 = bool17;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzc((IGamesCallbacks)localObject1, (String)localObject2, bool1);
      paramParcel2.writeNoException();
      return true;
    case 6505: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      bool1 = bool18;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzd((IGamesCallbacks)localObject1, (String)localObject2, bool1);
      paramParcel2.writeNoException();
      return true;
    case 6506: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      bool1 = bool19;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzb((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, bool1);
      paramParcel2.writeNoException();
      return true;
    case 6507: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        paramParcel1 = zzn(paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 7001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzk(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 7002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 7003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      localObject3 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzb((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, (IBinder)localObject3, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 8001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 8002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzdP(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.createIntArray());
      paramParcel2.writeNoException();
      return true;
    case 8004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      localObject2 = paramParcel1.createStringArray();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((IGamesCallbacks)localObject1, paramInt1, paramInt2, (String[])localObject2, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 8005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzl(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzm(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createByteArray(), paramParcel1.readString(), (ParticipantResult[])paramParcel1.createTypedArray(ParticipantResult.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 8008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createByteArray(), (ParticipantResult[])paramParcel1.createTypedArray(ParticipantResult.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 8009: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzn(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8010: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzo(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8011: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzc(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8012: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzb(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 8013: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzH(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 8014: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzp(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8024: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = zzwL();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 8025: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzF(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8015: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzd(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8016: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zze(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8017: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createIntArray());
      paramParcel2.writeNoException();
      return true;
    case 8026: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zze(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 8018: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readLong(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8019: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzb(paramParcel1.readLong(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8020: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzb(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readLong(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8021: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzc(paramParcel1.readLong(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8022: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzwX();
      paramParcel2.writeNoException();
      return true;
    case 8023: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      bool1 = bool20;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 8027: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool21;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzc((IGamesCallbacks)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 9001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label6254;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        zzc((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
      }
    case 9002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzq(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 9003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwz();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzdQ(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwA();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwB();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwC();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        paramParcel1 = zzb(paramInt1, paramInt2, bool1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9009: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        paramParcel1 = zzc(paramInt1, paramInt2, bool1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9010: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwH();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9011: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (RoomEntity)RoomEntity.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        paramParcel1 = zza((RoomEntity)localObject1, paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9012: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwI();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9013: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwY();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9031: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject2 = (ParticipantEntity[])paramParcel1.createTypedArray(ParticipantEntity.CREATOR);
      localObject3 = paramParcel1.readString();
      localObject4 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label6929;
        }
      }
      for (paramParcel1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        paramParcel1 = zza((ParticipantEntity[])localObject2, (String)localObject3, (String)localObject4, (Uri)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label6934;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
        localObject1 = null;
        break;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9019: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = zzwJ();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 9020: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label7034;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        zzd((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
      }
    case 9028: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label7119;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        zza((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
      }
    case 9030: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzdR(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 10001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzc(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 10002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzI(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 10003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzc(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readLong(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 10004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzd(paramParcel1.readLong(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 10005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createStringArray(), paramParcel1.readInt(), paramParcel1.createByteArray(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 10006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 10007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzb(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 10008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 10009: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 10010: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 10011: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 10012: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zza(paramParcel1.readInt(), paramParcel1.createByteArray(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 10013: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = zzwN();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 10023: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = zzwO();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 10015: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzwM();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 10022: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = GameRequestCluster.CREATOR.zzeq(paramParcel1);
      }
      paramParcel1 = zza((GameRequestCluster)localObject1, paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 10014: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzu(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 10016: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 10017: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      bool1 = bool22;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzb((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 10021: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = ZInvitationCluster.CREATOR.zzeo(paramParcel1);
      }
      paramParcel1 = zza((ZInvitationCluster)localObject1, paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 10018: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.createIntArray());
      paramParcel2.writeNoException();
      return true;
    case 10019: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.createIntArray());
      paramParcel2.writeNoException();
      return true;
    case 10020: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzc(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 11001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzj(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 11002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzwZ();
      paramParcel2.writeNoException();
      return true;
    case 12001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label8097;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        paramParcel1 = zza((String)localObject1, bool1, bool2, paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label8103;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
        bool1 = false;
        break;
      }
      paramParcel2.writeInt(0);
      return true;
    case 12002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool23;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzd((IGamesCallbacks)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 12003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      bool1 = bool24;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzc((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, bool1);
      paramParcel2.writeNoException();
      return true;
    case 12006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      bool1 = bool25;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zze((IGamesCallbacks)localObject1, (String)localObject2, bool1);
      paramParcel2.writeNoException();
      return true;
    case 12007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = SnapshotMetadataChangeEntity.CREATOR.zzeC(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label8343;
        }
      }
      for (paramParcel1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((IGamesCallbacks)localObject2, (String)localObject3, (SnapshotMetadataChangeEntity)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 12019: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 12020: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzr(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12033: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      localObject4 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = SnapshotMetadataChangeEntity.CREATOR.zzeC(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label8505;
        }
      }
      for (paramParcel1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4, (SnapshotMetadataChangeEntity)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 12035: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = zzwP();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 12036: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramInt1 = zzwQ();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 12005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzs(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12023: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzb(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 12024: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzc(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 12021: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label8714;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        zze((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
      }
    case 12022: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label8791;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        zzf((IGamesCallbacks)localObject1, (String)localObject2, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
      }
    case 12025: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      bool1 = zzxa();
      paramParcel2.writeNoException();
      paramInt1 = j;
      if (bool1) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    case 12026: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      bool1 = bool26;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzaj(bool1);
      paramParcel2.writeNoException();
      return true;
    case 12027: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzt(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12032: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool27;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zze((IGamesCallbacks)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 12016: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool28;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzf((IGamesCallbacks)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 12031: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool29;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject1, bool1, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 12017: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzp(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 12008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzu(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12009: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzf(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12010: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.createIntArray();
      paramInt1 = paramParcel1.readInt();
      bool1 = bool30;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject1, (int[])localObject2, paramInt1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 12029: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.createStringArray();
      bool1 = bool31;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject1, (String[])localObject2, bool1);
      paramParcel2.writeNoException();
      return true;
    case 12015: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      localObject4 = paramParcel1.createIntArray();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        zza((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, (int[])localObject4, paramInt1, bool1);
        paramParcel2.writeNoException();
        return true;
      }
    case 12028: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      localObject4 = paramParcel1.createStringArray();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        zza((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, (String[])localObject4, bool1);
        paramParcel2.writeNoException();
        return true;
      }
    case 12011: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzd(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 12013: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzd(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()), paramParcel1.readLong(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12012: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzJ(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 12014: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zze(paramParcel1.readLong(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12030: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzb(paramParcel1.createIntArray());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 12034: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzdI(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 12018: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label9623;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        zzb((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, paramInt1, bool1, bool2);
        paramParcel2.writeNoException();
        return true;
        bool1 = false;
        break;
      }
    case 13001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      bool1 = bool32;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzak(bool1);
      paramParcel2.writeNoException();
      return true;
    case 13002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = paramParcel1.readString();
      localObject2 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((String)localObject1, (IBinder)localObject2, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 13003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool33;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzg((IGamesCallbacks)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 13004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool34;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzh((IGamesCallbacks)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 13005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (AchievementEntity)AchievementEntity.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        paramParcel1 = zza(paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 13006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      bool1 = bool35;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzf((IGamesCallbacks)localObject1, (String)localObject2, bool1);
      paramParcel2.writeNoException();
      return true;
    case 14001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzv(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 14002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.createStringArray();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        zza((IGamesCallbacks)localObject1, paramInt1, (String)localObject2, (String[])localObject3, bool1);
        paramParcel2.writeNoException();
        return true;
      }
    case 14003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject3 = (ParticipantEntity[])paramParcel1.createTypedArray(ParticipantEntity.CREATOR);
      localObject4 = paramParcel1.readString();
      str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label10153;
        }
      }
      for (localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        paramParcel1 = zza((ParticipantEntity[])localObject3, (String)localObject4, str, (Uri)localObject1, (Uri)localObject2, paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label10159;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
        localObject1 = null;
        break;
      }
      paramParcel2.writeInt(0);
      return true;
    case 15001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      bool1 = bool36;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza((IGamesCallbacks)localObject1, (String)localObject2, bool1, paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 15002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzb(paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 15501: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(IGamesClient.Stub.zzbX(paramParcel1.readStrongBinder()), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 15502: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzK(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 15503: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        paramParcel1 = zza(paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 15504: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzxb();
      paramParcel2.writeNoException();
      return true;
    case 16001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzxc();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 17001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      bool1 = bool37;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzi((IGamesCallbacks)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 18001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzm(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 19001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzk(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 19002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzxd();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 19003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (VideoConfiguration)VideoConfiguration.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((IGamesCallbacks)localObject1, (String)localObject2, (String)localObject3, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 19004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzl(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 20001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zza(paramParcel1.readString(), IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 21001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzxe();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 21002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      paramParcel1 = zzdS(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 21003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Account)Account.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((String)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 21004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject4 = (ParticipantEntity[])paramParcel1.createTypedArray(ParticipantEntity.CREATOR);
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (Account)Account.CREATOR.createFromParcel(paramParcel1);
        str = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label10948;
        }
        localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label10954;
        }
      }
      for (localObject3 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);; localObject3 = null)
      {
        paramParcel1 = zza((ParticipantEntity[])localObject4, (Account)localObject1, str, (Uri)localObject2, (Uri)localObject3, paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label10960;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label10881;
      }
      paramParcel2.writeInt(0);
      return true;
    case 21005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = GameRequestCluster.CREATOR.zzeq(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label11044;
        }
      }
      for (paramParcel1 = (Account)Account.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        paramParcel1 = zza((GameRequestCluster)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label11049;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
        localObject1 = null;
        break;
      }
      paramParcel2.writeInt(0);
      return true;
    case 21006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = ZInvitationCluster.CREATOR.zzeo(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label11139;
        }
      }
      for (localObject2 = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        paramParcel1 = zza((ZInvitationCluster)localObject1, (Account)localObject2, paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label11145;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
        localObject1 = null;
        break;
      }
      paramParcel2.writeInt(0);
      return true;
    case 21007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzm(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 21008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzn(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 21009: 
      label10153:
      label10159:
      label10881:
      label10948:
      label10954:
      label10960:
      label11044:
      label11049:
      label11139:
      label11145:
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      zzo(IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
    paramParcel1 = zzxf();
    paramParcel2.writeNoException();
    paramParcel2.writeList(paramParcel1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.IGamesService.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */