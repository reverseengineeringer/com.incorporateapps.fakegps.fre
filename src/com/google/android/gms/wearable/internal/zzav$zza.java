package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;

public abstract class zzav$zza
  extends Binder
  implements zzav
{
  public zzav$zza()
  {
    attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
  }
  
  public static zzav zzes(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzav))) {
      return (zzav)localIInterface;
    }
    return new zzav.zza.zza(paramIBinder);
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
    Object localObject19 = null;
    Object localObject20 = null;
    Object localObject21 = null;
    Object localObject22 = null;
    Object localObject23 = null;
    Object localObject24 = null;
    Object localObject25 = null;
    Object localObject26 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetConfigResponse)GetConfigResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetConfigResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetConfigsResponse)GetConfigsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetConfigsResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 28: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetCloudSyncOptInOutDoneResponse)GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetCloudSyncOptInOutDoneResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 29: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetCloudSyncSettingResponse)GetCloudSyncSettingResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetCloudSyncSettingResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 30: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject5;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetCloudSyncOptInStatusResponse)GetCloudSyncOptInStatusResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetCloudSyncOptInStatusResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject6;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (PutDataResponse)PutDataResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((PutDataResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject7;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetDataItemResponse)GetDataItemResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetDataItemResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject8;
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzah((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject9;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DeleteDataItemsResponse)DeleteDataItemsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DeleteDataItemsResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject10;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SendMessageResponse)SendMessageResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SendMessageResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject11;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetFdForAssetResponse)GetFdForAssetResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetFdForAssetResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject12;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetLocalNodeResponse)GetLocalNodeResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetLocalNodeResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject13;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetConnectedNodesResponse)GetConnectedNodesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetConnectedNodesResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject14;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (OpenChannelResponse)OpenChannelResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OpenChannelResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject15;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((CloseChannelResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject16;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((CloseChannelResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject17;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetChannelInputStreamResponse)GetChannelInputStreamResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetChannelInputStreamResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject18;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetChannelOutputStreamResponse)GetChannelOutputStreamResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetChannelOutputStreamResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject19;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ChannelReceiveFileResponse)ChannelReceiveFileResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ChannelReceiveFileResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject20;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ChannelSendFileResponse)ChannelSendFileResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ChannelSendFileResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject21;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      zza((Status)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject22;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (StorageInfoResponse)StorageInfoResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((StorageInfoResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 22: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject23;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetCapabilityResponse)GetCapabilityResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetCapabilityResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 23: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject24;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetAllCapabilitiesResponse)GetAllCapabilitiesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetAllCapabilitiesResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 26: 
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      localObject1 = localObject25;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (AddLocalCapabilityResponse)AddLocalCapabilityResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((AddLocalCapabilityResponse)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
    localObject1 = localObject26;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (RemoveLocalCapabilityResponse)RemoveLocalCapabilityResponse.CREATOR.createFromParcel(paramParcel1);
    }
    zza((RemoveLocalCapabilityResponse)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzav.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */