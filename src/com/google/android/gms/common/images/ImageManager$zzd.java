package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.internal.zzb;
import java.util.HashSet;
import java.util.Map;

final class ImageManager$zzd
  implements Runnable
{
  private final zza zzajM;
  
  public ImageManager$zzd(ImageManager paramImageManager, zza paramzza)
  {
    zzajM = paramzza;
  }
  
  public final void run()
  {
    zzb.zzcD("LoadImageRunnable must be executed on the main thread");
    Object localObject1 = (ImageManager.ImageReceiver)ImageManager.zza(zzajK).get(zzajM);
    if (localObject1 != null)
    {
      ImageManager.zza(zzajK).remove(zzajM);
      ((ImageManager.ImageReceiver)localObject1).zzc(zzajM);
    }
    zza.zza localzza = zzajM.zzajO;
    if (uri == null)
    {
      zzajM.zza(ImageManager.zzb(zzajK), ImageManager.zzc(zzajK), true);
      return;
    }
    localObject1 = ImageManager.zza(zzajK, localzza);
    if (localObject1 != null)
    {
      zzajM.zza(ImageManager.zzb(zzajK), (Bitmap)localObject1, true);
      return;
    }
    localObject1 = (Long)ImageManager.zzd(zzajK).get(uri);
    if (localObject1 != null)
    {
      if (SystemClock.elapsedRealtime() - ((Long)localObject1).longValue() < 3600000L)
      {
        zzajM.zza(ImageManager.zzb(zzajK), ImageManager.zzc(zzajK), true);
        return;
      }
      ImageManager.zzd(zzajK).remove(uri);
    }
    zzajM.zza(ImageManager.zzb(zzajK), ImageManager.zzc(zzajK));
    ??? = (ImageManager.ImageReceiver)ImageManager.zze(zzajK).get(uri);
    localObject1 = ???;
    if (??? == null)
    {
      localObject1 = new ImageManager.ImageReceiver(zzajK, uri);
      ImageManager.zze(zzajK).put(uri, localObject1);
    }
    ((ImageManager.ImageReceiver)localObject1).zzb(zzajM);
    if (!(zzajM instanceof zza.zzc)) {
      ImageManager.zza(zzajK).put(zzajM, localObject1);
    }
    synchronized (ImageManager.zzqk())
    {
      if (!ImageManager.zzql().contains(uri))
      {
        ImageManager.zzql().add(uri);
        ((ImageManager.ImageReceiver)localObject1).zzqm();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */