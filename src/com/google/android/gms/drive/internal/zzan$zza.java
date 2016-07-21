package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.zzm.zza;

public abstract class zzan$zza
  extends Binder
  implements zzan
{
  public zzan$zza()
  {
    attachInterface(this, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
  }
  
  public static zzan zzbb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzan))) {
      return (zzan)localIInterface;
    }
    return new zzan.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
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
    Object localObject12 = null;
    Object localObject13 = null;
    Object localObject14 = null;
    Object localObject15 = null;
    Object localObject16 = null;
    Object localObject17 = null;
    Object localObject18 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnDownloadProgressResponse)OnDownloadProgressResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnDownloadProgressResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnListEntriesResponse)OnListEntriesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnListEntriesResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnDriveIdResponse)OnDriveIdResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnDriveIdResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnMetadataResponse)OnMetadataResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnMetadataResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject5;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnContentsResponse)OnContentsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnContentsResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject6;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      onError((Status)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      onSuccess();
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject7;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnListParentsResponse)OnListParentsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnListParentsResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject8;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnSyncMoreResponse)OnSyncMoreResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnSyncMoreResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject9;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnLoadRealtimeResponse)OnLoadRealtimeResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnLoadRealtimeResponse)localObject1, zzm.zza.zzbo(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject10;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnResourceIdSetResponse)OnResourceIdSetResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnResourceIdSetResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject11;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnPinnedDownloadPreferencesResponse)OnPinnedDownloadPreferencesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnPinnedDownloadPreferencesResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject12;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnDeviceUsagePreferenceResponse)OnDeviceUsagePreferenceResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnDeviceUsagePreferenceResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        zzaf(bool);
        paramParcel2.writeNoException();
        return true;
      }
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject13;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnFetchThumbnailResponse)OnFetchThumbnailResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnFetchThumbnailResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject14;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ChangeSequenceNumber)ChangeSequenceNumber.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ChangeSequenceNumber)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject15;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OnChangesResponse)OnChangesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnChangesResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject16;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetPermissionsResponse)GetPermissionsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetPermissionsResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      localObject1 = localObject17;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (StringListResponse)StringListResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((StringListResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
    localObject1 = localObject18;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (OnStartStreamSession)OnStartStreamSession.CREATOR.createFromParcel(paramParcel1);
    }
    zza((OnStartStreamSession)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzan.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */