package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;

public abstract class zzom$zza
  extends Binder
  implements zzom
{
  public static zzom zzbH(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
    if ((localIInterface != null) && ((localIInterface instanceof zzom))) {
      return (zzom)localIInterface;
    }
    return new zzom.zza.zza(paramIBinder);
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
    Object localObject9 = null;
    Object localObject10 = null;
    Object localObject11 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DataReadRequest)DataReadRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataReadRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DataInsertRequest)DataInsertRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataInsertRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DataDeleteRequest)DataDeleteRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataDeleteRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetSyncInfoRequest)GetSyncInfoRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetSyncInfoRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      localObject1 = localObject5;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ReadStatsRequest)ReadStatsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ReadStatsRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      localObject1 = localObject6;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ReadRawRequest)ReadRawRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ReadRawRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      localObject1 = localObject7;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DailyTotalRequest)DailyTotalRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DailyTotalRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      localObject1 = localObject8;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DataInsertRequest)DataInsertRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((DataInsertRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      localObject1 = localObject9;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DataUpdateRequest)DataUpdateRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataUpdateRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      localObject1 = localObject10;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DataUpdateListenerRegistrationRequest)DataUpdateListenerRegistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataUpdateListenerRegistrationRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
    localObject1 = localObject11;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (DataUpdateListenerUnregistrationRequest)DataUpdateListenerUnregistrationRequest.CREATOR.createFromParcel(paramParcel1);
    }
    zza((DataUpdateListenerUnregistrationRequest)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzom.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */