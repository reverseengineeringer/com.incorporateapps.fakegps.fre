package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.video.VideoCapabilities;

public abstract class IGamesCallbacks$Stub
  extends Binder
  implements IGamesCallbacks
{
  public IGamesCallbacks$Stub()
  {
    attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
  }
  
  public static IGamesCallbacks zzbW(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof IGamesCallbacks))) {
      return (IGamesCallbacks)localIInterface;
    }
    return new IGamesCallbacks.Stub.Proxy(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    Object localObject2 = null;
    Contents localContents1 = null;
    String str = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject9 = null;
    Object localObject10 = null;
    Object localObject11 = null;
    Object localObject12 = null;
    Object localObject13 = null;
    Object localObject14 = null;
    Object localObject15 = null;
    Object localObject16 = null;
    Object localObject17 = null;
    Object localObject18 = null;
    Object localObject19 = null;
    Object localObject20 = null;
    Object localObject21 = null;
    Object localObject22 = null;
    Object localObject23 = null;
    Object localObject24 = null;
    Object localObject25 = null;
    Object localObject26 = null;
    Object localObject27 = null;
    Object localObject28 = null;
    Object localObject29 = null;
    Object localObject30 = null;
    Object localObject31 = null;
    Object localObject32 = null;
    Object localObject33 = null;
    Object localObject34 = null;
    Object localObject35 = null;
    Object localObject36 = null;
    Contents localContents2 = null;
    Object localObject37 = null;
    Object localObject38 = null;
    Object localObject39 = null;
    Object localObject40 = null;
    Object localObject41 = null;
    Object localObject42 = null;
    Object localObject43 = null;
    Object localObject44 = null;
    Object localObject45 = null;
    Object localObject46 = null;
    Object localObject47 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
      return true;
    case 5001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzg(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = DataHolder.CREATOR.zzak(paramParcel1);; paramParcel1 = null)
      {
        zzh(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzh(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzj((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = DataHolder.CREATOR.zzak(paramParcel1);; localObject1 = null)
      {
        if (paramParcel1.readInt() != 0) {
          localObject2 = DataHolder.CREATOR.zzak(paramParcel1);
        }
        zza((DataHolder)localObject1, (DataHolder)localObject2);
        paramParcel2.writeNoException();
        return true;
      }
    case 5006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localContents1;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzk((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = str;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzl((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzm((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5009: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzn((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5010: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject5;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzo((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5011: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject6;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzp((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5016: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzwr();
      paramParcel2.writeNoException();
      return true;
    case 5017: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject7;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzr((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5037: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject8;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzs((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5018: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject9;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzz((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5019: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject10;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzA((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5020: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      onLeftRoom(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5021: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject11;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzB((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5022: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject12;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzC((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5023: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject13;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzD((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5024: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject14;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzE((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5025: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject15;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzF((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5026: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject16;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zza((DataHolder)localObject1, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5027: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject17;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzb((DataHolder)localObject1, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5028: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject18;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzc((DataHolder)localObject1, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5029: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject19;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzd((DataHolder)localObject1, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5030: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject20;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zze((DataHolder)localObject1, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5031: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject21;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzf((DataHolder)localObject1, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5032: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (RealTimeMessage)RealTimeMessage.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        onRealTimeMessageReceived(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 5033: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzb(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5034: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      paramInt1 = paramParcel1.readInt();
      localObject1 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zza(paramInt1, (String)localObject1, bool1);
      paramParcel2.writeNoException();
      return true;
    case 5038: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject22;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzG((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5035: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject23;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzH((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5036: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzgn(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5039: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject24;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzI((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5040: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzgo(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 6001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      onP2PConnected(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 6002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      onP2PDisconnected(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject25;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzJ((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzc(paramInt1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 8003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject26;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzu((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject27;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzv((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject28;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzw((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject29;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzx((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzi(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject30;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzy((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8009: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      onTurnBasedMatchRemoved(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8010: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      onInvitationRemoved(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 9001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject31;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzq((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 10001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject32;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzt((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 10002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      onRequestRemoved(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 10003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject33;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzK((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 10004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject34;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzL((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 10005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzd(paramInt1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 10006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject35;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzM((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 11001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zze(paramInt1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 12001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject36;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzN((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2916;
        }
      }
      for (paramParcel1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((DataHolder)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 12017: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
        str = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label3038;
        }
        localObject2 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label3044;
        }
      }
      for (localContents1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);; localContents1 = null)
      {
        if (paramParcel1.readInt() != 0) {
          localContents2 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);
        }
        zza((DataHolder)localObject1, str, (Contents)localObject2, localContents1, localContents2);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label2970;
      }
    case 12005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject37;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzO((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12012: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzj(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzf(paramInt1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 12013: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject38;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzU((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12011: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject39;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzi((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject40;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzP((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject41;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzQ((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12014: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject42;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzR((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12016: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject43;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzS((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject44;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzT((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12015: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzg(paramInt1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 13001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject45;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzV((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 13002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzgp(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 14001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zza((DataHolder[])paramParcel1.createTypedArray(DataHolder.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 15001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject46;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzW((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 17001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = localObject47;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzX((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 17002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      zzgq(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 19001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (VideoCapabilities)VideoCapabilities.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza(paramInt1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 19002: 
      label2916:
      label2970:
      label3038:
      label3044:
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      paramInt1 = paramParcel1.readInt();
      bool1 = bool2;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      zzd(paramInt1, bool1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
    zza(paramParcel1.readInt(), paramParcel1.createLongArray());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.IGamesCallbacks.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */