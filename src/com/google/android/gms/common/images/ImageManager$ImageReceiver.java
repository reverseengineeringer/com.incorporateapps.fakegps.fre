package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.zzb;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

final class ImageManager$ImageReceiver
  extends ResultReceiver
{
  private final Uri mUri;
  private final ArrayList zzajJ;
  
  ImageManager$ImageReceiver(ImageManager paramImageManager, Uri paramUri)
  {
    super(new Handler(Looper.getMainLooper()));
    mUri = paramUri;
    zzajJ = new ArrayList();
  }
  
  public final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    paramBundle = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
    ImageManager.zzf(zzajK).execute(new ImageManager.zzc(zzajK, mUri, paramBundle));
  }
  
  public final void zzb(zza paramzza)
  {
    zzb.zzcD("ImageReceiver.addImageRequest() must be called in the main thread");
    zzajJ.add(paramzza);
  }
  
  public final void zzc(zza paramzza)
  {
    zzb.zzcD("ImageReceiver.removeImageRequest() must be called in the main thread");
    zzajJ.remove(paramzza);
  }
  
  public final void zzqm()
  {
    Intent localIntent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
    localIntent.putExtra("com.google.android.gms.extras.uri", mUri);
    localIntent.putExtra("com.google.android.gms.extras.resultReceiver", this);
    localIntent.putExtra("com.google.android.gms.extras.priority", 3);
    ImageManager.zzb(zzajK).sendBroadcast(localIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.ImageReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */