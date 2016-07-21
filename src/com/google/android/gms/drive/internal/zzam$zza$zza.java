package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

class zzam$zza$zza
  implements zzam
{
  private IBinder zzoz;
  
  zzam$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public IntentSender zza(CreateFileIntentSenderRequest paramCreateFileIntentSenderRequest)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramCreateFileIntentSenderRequest != null)
        {
          localParcel1.writeInt(1);
          paramCreateFileIntentSenderRequest.writeToParcel(localParcel1, 0);
          zzoz.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            paramCreateFileIntentSenderRequest = (IntentSender)IntentSender.CREATOR.createFromParcel(localParcel2);
            return paramCreateFileIntentSenderRequest;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramCreateFileIntentSenderRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public IntentSender zza(OpenFileIntentSenderRequest paramOpenFileIntentSenderRequest)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramOpenFileIntentSenderRequest != null)
        {
          localParcel1.writeInt(1);
          paramOpenFileIntentSenderRequest.writeToParcel(localParcel1, 0);
          zzoz.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            paramOpenFileIntentSenderRequest = (IntentSender)IntentSender.CREATOR.createFromParcel(localParcel2);
            return paramOpenFileIntentSenderRequest;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramOpenFileIntentSenderRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public DriveServiceResponse zza(OpenContentsRequest paramOpenContentsRequest, zzan paramzzan)
  {
    Object localObject = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramOpenContentsRequest != null)
        {
          localParcel1.writeInt(1);
          paramOpenContentsRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramOpenContentsRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramOpenContentsRequest);
            zzoz.transact(7, localParcel1, localParcel2, 0);
            localParcel2.readException();
            paramOpenContentsRequest = (OpenContentsRequest)localObject;
            if (localParcel2.readInt() != 0) {
              paramOpenContentsRequest = (DriveServiceResponse)DriveServiceResponse.CREATOR.createFromParcel(localParcel2);
            }
            return paramOpenContentsRequest;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramOpenContentsRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public DriveServiceResponse zza(StreamContentsRequest paramStreamContentsRequest, zzan paramzzan)
  {
    Object localObject = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramStreamContentsRequest != null)
        {
          localParcel1.writeInt(1);
          paramStreamContentsRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramStreamContentsRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramStreamContentsRequest);
            zzoz.transact(56, localParcel1, localParcel2, 0);
            localParcel2.readException();
            paramStreamContentsRequest = (StreamContentsRequest)localObject;
            if (localParcel2.readInt() != 0) {
              paramStreamContentsRequest = (DriveServiceResponse)DriveServiceResponse.CREATOR.createFromParcel(localParcel2);
            }
            return paramStreamContentsRequest;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramStreamContentsRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(RealtimeDocumentSyncRequest paramRealtimeDocumentSyncRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramRealtimeDocumentSyncRequest != null)
        {
          localParcel1.writeInt(1);
          paramRealtimeDocumentSyncRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramRealtimeDocumentSyncRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramRealtimeDocumentSyncRequest);
            zzoz.transact(34, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramRealtimeDocumentSyncRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(AddEventListenerRequest paramAddEventListenerRequest, zzao paramzzao, String paramString, zzan paramzzan)
  {
    Object localObject = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramAddEventListenerRequest != null)
        {
          localParcel1.writeInt(1);
          paramAddEventListenerRequest.writeToParcel(localParcel1, 0);
          if (paramzzao != null)
          {
            paramAddEventListenerRequest = paramzzao.asBinder();
            localParcel1.writeStrongBinder(paramAddEventListenerRequest);
            localParcel1.writeString(paramString);
            paramAddEventListenerRequest = (AddEventListenerRequest)localObject;
            if (paramzzan != null) {
              paramAddEventListenerRequest = paramzzan.asBinder();
            }
            localParcel1.writeStrongBinder(paramAddEventListenerRequest);
            zzoz.transact(14, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramAddEventListenerRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(AddPermissionRequest paramAddPermissionRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramAddPermissionRequest != null)
        {
          localParcel1.writeInt(1);
          paramAddPermissionRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramAddPermissionRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramAddPermissionRequest);
            zzoz.transact(48, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramAddPermissionRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(AuthorizeAccessRequest paramAuthorizeAccessRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramAuthorizeAccessRequest != null)
        {
          localParcel1.writeInt(1);
          paramAuthorizeAccessRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramAuthorizeAccessRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramAuthorizeAccessRequest);
            zzoz.transact(12, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramAuthorizeAccessRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(CancelPendingActionsRequest paramCancelPendingActionsRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramCancelPendingActionsRequest != null)
        {
          localParcel1.writeInt(1);
          paramCancelPendingActionsRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramCancelPendingActionsRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramCancelPendingActionsRequest);
            zzoz.transact(37, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramCancelPendingActionsRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(ChangeResourceParentsRequest paramChangeResourceParentsRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramChangeResourceParentsRequest != null)
        {
          localParcel1.writeInt(1);
          paramChangeResourceParentsRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramChangeResourceParentsRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramChangeResourceParentsRequest);
            zzoz.transact(55, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramChangeResourceParentsRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(CheckResourceIdsExistRequest paramCheckResourceIdsExistRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramCheckResourceIdsExistRequest != null)
        {
          localParcel1.writeInt(1);
          paramCheckResourceIdsExistRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramCheckResourceIdsExistRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramCheckResourceIdsExistRequest);
            zzoz.transact(30, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramCheckResourceIdsExistRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(CloseContentsAndUpdateMetadataRequest paramCloseContentsAndUpdateMetadataRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramCloseContentsAndUpdateMetadataRequest != null)
        {
          localParcel1.writeInt(1);
          paramCloseContentsAndUpdateMetadataRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramCloseContentsAndUpdateMetadataRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramCloseContentsAndUpdateMetadataRequest);
            zzoz.transact(18, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramCloseContentsAndUpdateMetadataRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(CloseContentsRequest paramCloseContentsRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramCloseContentsRequest != null)
        {
          localParcel1.writeInt(1);
          paramCloseContentsRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramCloseContentsRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramCloseContentsRequest);
            zzoz.transact(8, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramCloseContentsRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(ControlProgressRequest paramControlProgressRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramControlProgressRequest != null)
        {
          localParcel1.writeInt(1);
          paramControlProgressRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramControlProgressRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramControlProgressRequest);
            zzoz.transact(53, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramControlProgressRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(CreateContentsRequest paramCreateContentsRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramCreateContentsRequest != null)
        {
          localParcel1.writeInt(1);
          paramCreateContentsRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramCreateContentsRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramCreateContentsRequest);
            zzoz.transact(4, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramCreateContentsRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(CreateFileRequest paramCreateFileRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramCreateFileRequest != null)
        {
          localParcel1.writeInt(1);
          paramCreateFileRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramCreateFileRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramCreateFileRequest);
            zzoz.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramCreateFileRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(CreateFolderRequest paramCreateFolderRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramCreateFolderRequest != null)
        {
          localParcel1.writeInt(1);
          paramCreateFolderRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramCreateFolderRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramCreateFolderRequest);
            zzoz.transact(6, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramCreateFolderRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(DeleteResourceRequest paramDeleteResourceRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramDeleteResourceRequest != null)
        {
          localParcel1.writeInt(1);
          paramDeleteResourceRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramDeleteResourceRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramDeleteResourceRequest);
            zzoz.transact(24, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramDeleteResourceRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public void zza(DisconnectRequest paramDisconnectRequest)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 36	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 158	com/google/android/gms/drive/internal/DisconnectRequest:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   33: bipush 16
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 48 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 51	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 70	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 70	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 36	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore_1
    //   66: aload_3
    //   67: invokevirtual 70	android/os/Parcel:recycle	()V
    //   70: aload_2
    //   71: invokevirtual 70	android/os/Parcel:recycle	()V
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	zza
    //   0	76	1	paramDisconnectRequest	DisconnectRequest
    //   3	68	2	localParcel1	Parcel
    //   7	60	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	29	65	finally
    //   29	48	65	finally
    //   57	62	65	finally
  }
  
  public void zza(FetchThumbnailRequest paramFetchThumbnailRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramFetchThumbnailRequest != null)
        {
          localParcel1.writeInt(1);
          paramFetchThumbnailRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramFetchThumbnailRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramFetchThumbnailRequest);
            zzoz.transact(42, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramFetchThumbnailRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(GetChangesRequest paramGetChangesRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramGetChangesRequest != null)
        {
          localParcel1.writeInt(1);
          paramGetChangesRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramGetChangesRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramGetChangesRequest);
            zzoz.transact(44, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramGetChangesRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(GetDriveIdFromUniqueIdentifierRequest paramGetDriveIdFromUniqueIdentifierRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramGetDriveIdFromUniqueIdentifierRequest != null)
        {
          localParcel1.writeInt(1);
          paramGetDriveIdFromUniqueIdentifierRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramGetDriveIdFromUniqueIdentifierRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramGetDriveIdFromUniqueIdentifierRequest);
            zzoz.transact(29, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramGetDriveIdFromUniqueIdentifierRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(GetMetadataRequest paramGetMetadataRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramGetMetadataRequest != null)
        {
          localParcel1.writeInt(1);
          paramGetMetadataRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramGetMetadataRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramGetMetadataRequest);
            zzoz.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramGetMetadataRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(GetPermissionsRequest paramGetPermissionsRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramGetPermissionsRequest != null)
        {
          localParcel1.writeInt(1);
          paramGetPermissionsRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramGetPermissionsRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramGetPermissionsRequest);
            zzoz.transact(47, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramGetPermissionsRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(ListParentsRequest paramListParentsRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramListParentsRequest != null)
        {
          localParcel1.writeInt(1);
          paramListParentsRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramListParentsRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramListParentsRequest);
            zzoz.transact(13, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramListParentsRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(LoadRealtimeRequest paramLoadRealtimeRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramLoadRealtimeRequest != null)
        {
          localParcel1.writeInt(1);
          paramLoadRealtimeRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramLoadRealtimeRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramLoadRealtimeRequest);
            zzoz.transact(27, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramLoadRealtimeRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(QueryRequest paramQueryRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramQueryRequest != null)
        {
          localParcel1.writeInt(1);
          paramQueryRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramQueryRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramQueryRequest);
            zzoz.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramQueryRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(QueryRequest paramQueryRequest, zzao paramzzao, zzan paramzzan)
  {
    Object localObject = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramQueryRequest != null)
        {
          localParcel1.writeInt(1);
          paramQueryRequest.writeToParcel(localParcel1, 0);
          if (paramzzao != null)
          {
            paramQueryRequest = paramzzao.asBinder();
            localParcel1.writeStrongBinder(paramQueryRequest);
            paramQueryRequest = (QueryRequest)localObject;
            if (paramzzan != null) {
              paramQueryRequest = paramzzan.asBinder();
            }
            localParcel1.writeStrongBinder(paramQueryRequest);
            zzoz.transact(51, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramQueryRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(RemoveEventListenerRequest paramRemoveEventListenerRequest, zzao paramzzao, String paramString, zzan paramzzan)
  {
    Object localObject = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramRemoveEventListenerRequest != null)
        {
          localParcel1.writeInt(1);
          paramRemoveEventListenerRequest.writeToParcel(localParcel1, 0);
          if (paramzzao != null)
          {
            paramRemoveEventListenerRequest = paramzzao.asBinder();
            localParcel1.writeStrongBinder(paramRemoveEventListenerRequest);
            localParcel1.writeString(paramString);
            paramRemoveEventListenerRequest = (RemoveEventListenerRequest)localObject;
            if (paramzzan != null) {
              paramRemoveEventListenerRequest = paramzzan.asBinder();
            }
            localParcel1.writeStrongBinder(paramRemoveEventListenerRequest);
            zzoz.transact(15, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramRemoveEventListenerRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(RemovePermissionRequest paramRemovePermissionRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramRemovePermissionRequest != null)
        {
          localParcel1.writeInt(1);
          paramRemovePermissionRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramRemovePermissionRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramRemovePermissionRequest);
            zzoz.transact(50, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramRemovePermissionRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(SetFileUploadPreferencesRequest paramSetFileUploadPreferencesRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramSetFileUploadPreferencesRequest != null)
        {
          localParcel1.writeInt(1);
          paramSetFileUploadPreferencesRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramSetFileUploadPreferencesRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramSetFileUploadPreferencesRequest);
            zzoz.transact(36, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramSetFileUploadPreferencesRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(SetPinnedDownloadPreferencesRequest paramSetPinnedDownloadPreferencesRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramSetPinnedDownloadPreferencesRequest != null)
        {
          localParcel1.writeInt(1);
          paramSetPinnedDownloadPreferencesRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramSetPinnedDownloadPreferencesRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramSetPinnedDownloadPreferencesRequest);
            zzoz.transact(33, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramSetPinnedDownloadPreferencesRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(SetResourceParentsRequest paramSetResourceParentsRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramSetResourceParentsRequest != null)
        {
          localParcel1.writeInt(1);
          paramSetResourceParentsRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramSetResourceParentsRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramSetResourceParentsRequest);
            zzoz.transact(28, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramSetResourceParentsRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(TrashResourceRequest paramTrashResourceRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramTrashResourceRequest != null)
        {
          localParcel1.writeInt(1);
          paramTrashResourceRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramTrashResourceRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramTrashResourceRequest);
            zzoz.transact(17, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramTrashResourceRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(UnsubscribeResourceRequest paramUnsubscribeResourceRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramUnsubscribeResourceRequest != null)
        {
          localParcel1.writeInt(1);
          paramUnsubscribeResourceRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramUnsubscribeResourceRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramUnsubscribeResourceRequest);
            zzoz.transact(46, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramUnsubscribeResourceRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(UntrashResourceRequest paramUntrashResourceRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramUntrashResourceRequest != null)
        {
          localParcel1.writeInt(1);
          paramUntrashResourceRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramUntrashResourceRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramUntrashResourceRequest);
            zzoz.transact(38, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramUntrashResourceRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(UpdateMetadataRequest paramUpdateMetadataRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramUpdateMetadataRequest != null)
        {
          localParcel1.writeInt(1);
          paramUpdateMetadataRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramUpdateMetadataRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramUpdateMetadataRequest);
            zzoz.transact(3, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramUpdateMetadataRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(UpdatePermissionRequest paramUpdatePermissionRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramUpdatePermissionRequest != null)
        {
          localParcel1.writeInt(1);
          paramUpdatePermissionRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramUpdatePermissionRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramUpdatePermissionRequest);
            zzoz.transact(49, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramUpdatePermissionRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public void zza(zzan paramzzan)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 82 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: bipush 9
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 48 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 51	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 70	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 70	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 70	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 70	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zza
    //   0	74	1	paramzzan	zzan
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void zza(zzao paramzzao, zzan paramzzan)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore 4
    //   7: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   10: astore 5
    //   12: aload 4
    //   14: ldc 28
    //   16: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: ifnull +68 -> 88
    //   23: aload_1
    //   24: invokeinterface 103 1 0
    //   29: astore_1
    //   30: aload 4
    //   32: aload_1
    //   33: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_3
    //   37: astore_1
    //   38: aload_2
    //   39: ifnull +10 -> 49
    //   42: aload_2
    //   43: invokeinterface 82 1 0
    //   48: astore_1
    //   49: aload 4
    //   51: aload_1
    //   52: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   55: aload_0
    //   56: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   59: bipush 52
    //   61: aload 4
    //   63: aload 5
    //   65: iconst_0
    //   66: invokeinterface 48 5 0
    //   71: pop
    //   72: aload 5
    //   74: invokevirtual 51	android/os/Parcel:readException	()V
    //   77: aload 5
    //   79: invokevirtual 70	android/os/Parcel:recycle	()V
    //   82: aload 4
    //   84: invokevirtual 70	android/os/Parcel:recycle	()V
    //   87: return
    //   88: aconst_null
    //   89: astore_1
    //   90: goto -60 -> 30
    //   93: astore_1
    //   94: aload 5
    //   96: invokevirtual 70	android/os/Parcel:recycle	()V
    //   99: aload 4
    //   101: invokevirtual 70	android/os/Parcel:recycle	()V
    //   104: aload_1
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	zza
    //   0	106	1	paramzzao	zzao
    //   0	106	2	paramzzan	zzan
    //   1	36	3	localObject	Object
    //   5	95	4	localParcel1	Parcel
    //   10	85	5	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   12	19	93	finally
    //   23	30	93	finally
    //   30	36	93	finally
    //   42	49	93	finally
    //   49	77	93	finally
  }
  
  public void zzb(QueryRequest paramQueryRequest, zzan paramzzan)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
        if (paramQueryRequest != null)
        {
          localParcel1.writeInt(1);
          paramQueryRequest.writeToParcel(localParcel1, 0);
          if (paramzzan != null)
          {
            paramQueryRequest = paramzzan.asBinder();
            localParcel1.writeStrongBinder(paramQueryRequest);
            zzoz.transact(19, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramQueryRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public void zzb(zzan paramzzan)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 82 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: bipush 31
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 48 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 51	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 70	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 70	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 70	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 70	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zza
    //   0	74	1	paramzzan	zzan
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void zzc(zzan paramzzan)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 82 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: bipush 32
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 48 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 51	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 70	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 70	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 70	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 70	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zza
    //   0	74	1	paramzzan	zzan
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void zzd(zzan paramzzan)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 82 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: bipush 35
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 48 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 51	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 70	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 70	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 70	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 70	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zza
    //   0	74	1	paramzzan	zzan
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void zze(zzan paramzzan)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 82 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: bipush 41
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 48 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 51	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 70	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 70	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 70	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 70	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zza
    //   0	74	1	paramzzan	zzan
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void zzf(zzan paramzzan)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 82 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: bipush 43
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 48 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 51	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 70	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 70	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 70	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 70	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zza
    //   0	74	1	paramzzan	zzan
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void zzg(zzan paramzzan)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 82 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: bipush 54
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 48 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 51	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 70	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 70	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 70	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 70	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zza
    //   0	74	1	paramzzan	zzan
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
  
  /* Error */
  public void zzh(zzan paramzzan)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +43 -> 58
    //   18: aload_1
    //   19: invokeinterface 82 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/drive/internal/zzam$zza$zza:zzoz	Landroid/os/IBinder;
    //   34: bipush 57
    //   36: aload_2
    //   37: aload_3
    //   38: iconst_0
    //   39: invokeinterface 48 5 0
    //   44: pop
    //   45: aload_3
    //   46: invokevirtual 51	android/os/Parcel:readException	()V
    //   49: aload_3
    //   50: invokevirtual 70	android/os/Parcel:recycle	()V
    //   53: aload_2
    //   54: invokevirtual 70	android/os/Parcel:recycle	()V
    //   57: return
    //   58: aconst_null
    //   59: astore_1
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_3
    //   65: invokevirtual 70	android/os/Parcel:recycle	()V
    //   68: aload_2
    //   69: invokevirtual 70	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zza
    //   0	74	1	paramzzan	zzan
    //   3	66	2	localParcel1	Parcel
    //   7	58	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	63	finally
    //   18	25	63	finally
    //   25	49	63	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzam.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */