package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class zzbp$2
  implements Runnable
{
  zzbp$2(zzbp paramzzbp, Uri paramUri, zza.zzb paramzzb, boolean paramBoolean, String paramString) {}
  
  public void run()
  {
    if (Log.isLoggable("WearableClient", 2)) {
      Log.v("WearableClient", "Executing receiveFileFromChannelTask");
    }
    if (!"file".equals(zzbds.getScheme()))
    {
      Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
      zzbto.zzw(new Status(10, "Channel.receiveFile used with non-file URI"));
      return;
    }
    File localFile = new File(zzbds.getPath());
    int i;
    if (zzbse) {
      i = 33554432;
    }
    try
    {
      localParcelFileDescriptor = ParcelFileDescriptor.open(localFile, i | 0x20000000);
    }
    catch (FileNotFoundException localRemoteException)
    {
      try
      {
        for (;;)
        {
          ParcelFileDescriptor localParcelFileDescriptor;
          ((zzax)zzbtn.zzqJ()).zza(new zzbo.zzu(zzbto), zzVj, localParcelFileDescriptor);
          try
          {
            localParcelFileDescriptor.close();
            return;
          }
          catch (IOException localIOException1)
          {
            Log.w("WearableClient", "Failed to close targetFd", localIOException1);
            return;
          }
          i = 0;
        }
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException = localRemoteException;
        Log.w("WearableClient", "Channel.receiveFile failed.", localRemoteException);
        zzbto.zzw(new Status(8));
        try
        {
          localFileNotFoundException.close();
          return;
        }
        catch (IOException localIOException2)
        {
          Log.w("WearableClient", "Failed to close targetFd", localIOException2);
          return;
        }
      }
      finally {}
      localFileNotFoundException = localFileNotFoundException;
      Log.w("WearableClient", "File couldn't be opened for Channel.receiveFile: " + localFile);
      zzbto.zzw(new Status(13));
      return;
    }
    try
    {
      localIOException2.close();
      throw ((Throwable)localObject);
    }
    catch (IOException localIOException3)
    {
      for (;;)
      {
        Log.w("WearableClient", "Failed to close targetFd", localIOException3);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbp.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */