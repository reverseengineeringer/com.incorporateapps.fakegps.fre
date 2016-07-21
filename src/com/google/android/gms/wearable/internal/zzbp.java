package com.google.android.gms.wearable.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class zzbp
  extends zzj
{
  private final ExecutorService zzbkn = Executors.newCachedThreadPool();
  private final zzay zzbte = new zzay();
  private final zzay zzbtf = new zzay();
  private final zzay zzbtg = new zzay();
  private final zzay zzbth = new zzay();
  private final zzay zzbti = new zzay();
  private final zzay zzbtj = new zzay();
  private final zzay zzbtk = new zzay();
  private final zzay zzbtl = new zzay();
  
  public zzbp(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, zzf paramzzf)
  {
    super(paramContext, paramLooper, 14, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  private FutureTask zza(ParcelFileDescriptor paramParcelFileDescriptor, byte[] paramArrayOfByte)
  {
    return new FutureTask(new zzbp.1(this, paramParcelFileDescriptor, paramArrayOfByte));
  }
  
  private Runnable zzb(zza.zzb paramzzb, String paramString, Uri paramUri, long paramLong1, long paramLong2)
  {
    zzx.zzz(paramzzb);
    zzx.zzz(paramString);
    zzx.zzz(paramUri);
    if (paramLong1 >= 0L)
    {
      bool = true;
      zzx.zzb(bool, "startOffset is negative: %s", new Object[] { Long.valueOf(paramLong1) });
      if (paramLong2 < -1L) {
        break label97;
      }
    }
    label97:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "invalid length: %s", new Object[] { Long.valueOf(paramLong2) });
      return new zzbp.3(this, paramUri, paramzzb, paramString, paramLong1, paramLong2);
      bool = false;
      break;
    }
  }
  
  private Runnable zzb(zza.zzb paramzzb, String paramString, Uri paramUri, boolean paramBoolean)
  {
    zzx.zzz(paramzzb);
    zzx.zzz(paramString);
    zzx.zzz(paramUri);
    return new zzbp.2(this, paramUri, paramzzb, paramBoolean, paramString);
  }
  
  protected void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    if (Log.isLoggable("WearableClient", 2)) {
      Log.d("WearableClient", "onPostInitHandler: statusCode " + paramInt1);
    }
    if (paramInt1 == 0)
    {
      zzbte.zzev(paramIBinder);
      zzbtf.zzev(paramIBinder);
      zzbtg.zzev(paramIBinder);
      zzbth.zzev(paramIBinder);
      zzbti.zzev(paramIBinder);
      zzbtj.zzev(paramIBinder);
      zzbtk.zzev(paramIBinder);
      zzbtl.zzev(paramIBinder);
    }
    super.zza(paramInt1, paramIBinder, paramBundle, paramInt2);
  }
  
  public void zza(zza.zzb paramzzb, Uri paramUri)
  {
    ((zzax)zzqJ()).zza(new zzbo.zzk(paramzzb), paramUri);
  }
  
  public void zza(zza.zzb paramzzb, Uri paramUri, int paramInt)
  {
    ((zzax)zzqJ()).zza(new zzbo.zzl(paramzzb), paramUri, paramInt);
  }
  
  public void zza(zza.zzb paramzzb, Asset paramAsset)
  {
    ((zzax)zzqJ()).zza(new zzbo.zzm(paramzzb), paramAsset);
  }
  
  public void zza(zza.zzb paramzzb, CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    zzbtl.zza(this, paramzzb, paramCapabilityListener);
  }
  
  public void zza(zza.zzb paramzzb, CapabilityApi.CapabilityListener paramCapabilityListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbtl.zza(this, paramzzb, paramCapabilityListener, zzbq.zze(paramzzq, paramArrayOfIntentFilter));
  }
  
  public void zza(zza.zzb paramzzb, ChannelApi.ChannelListener paramChannelListener, zzq paramzzq, String paramString, IntentFilter[] paramArrayOfIntentFilter)
  {
    if (paramString == null)
    {
      zzbtg.zza(this, paramzzb, paramChannelListener, zzbq.zzd(paramzzq, paramArrayOfIntentFilter));
      return;
    }
    paramChannelListener = new zzbj(paramString, paramChannelListener);
    zzbtg.zza(this, paramzzb, paramChannelListener, zzbq.zza(paramzzq, paramString, paramArrayOfIntentFilter));
  }
  
  public void zza(zza.zzb paramzzb, ChannelApi.ChannelListener paramChannelListener, String paramString)
  {
    if (paramString == null)
    {
      zzbtg.zza(this, paramzzb, paramChannelListener);
      return;
    }
    paramChannelListener = new zzbj(paramString, paramChannelListener);
    zzbtg.zza(this, paramzzb, paramChannelListener);
  }
  
  public void zza(zza.zzb paramzzb, DataApi.DataListener paramDataListener)
  {
    zzbth.zza(this, paramzzb, paramDataListener);
  }
  
  public void zza(zza.zzb paramzzb, DataApi.DataListener paramDataListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbth.zza(this, paramzzb, paramDataListener, zzbq.zza(paramzzq, paramArrayOfIntentFilter));
  }
  
  public void zza(zza.zzb paramzzb, DataItemAsset paramDataItemAsset)
  {
    zza(paramzzb, Asset.createFromRef(paramDataItemAsset.getId()));
  }
  
  public void zza(zza.zzb paramzzb, MessageApi.MessageListener paramMessageListener)
  {
    zzbti.zza(this, paramzzb, paramMessageListener);
  }
  
  public void zza(zza.zzb paramzzb, MessageApi.MessageListener paramMessageListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbti.zza(this, paramzzb, paramMessageListener, zzbq.zzb(paramzzq, paramArrayOfIntentFilter));
  }
  
  public void zza(zza.zzb paramzzb, NodeApi.NodeListener paramNodeListener)
  {
    zzbtj.zza(this, paramzzb, paramNodeListener);
  }
  
  public void zza(zza.zzb paramzzb, NodeApi.NodeListener paramNodeListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbtj.zza(this, paramzzb, paramNodeListener, zzbq.zzc(paramzzq, paramArrayOfIntentFilter));
  }
  
  public void zza(zza.zzb paramzzb, PutDataRequest paramPutDataRequest)
  {
    Object localObject1 = paramPutDataRequest.getAssets().entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Asset)((Map.Entry)((Iterator)localObject1).next()).getValue();
      if ((((Asset)localObject2).getData() == null) && (((Asset)localObject2).getDigest() == null) && (((Asset)localObject2).getFd() == null) && (((Asset)localObject2).getUri() == null)) {
        throw new IllegalArgumentException("Put for " + paramPutDataRequest.getUri() + " contains invalid asset: " + localObject2);
      }
    }
    Object localObject2 = PutDataRequest.zzr(paramPutDataRequest.getUri());
    ((PutDataRequest)localObject2).setData(paramPutDataRequest.getData());
    if (paramPutDataRequest.isUrgent()) {
      ((PutDataRequest)localObject2).setUrgent();
    }
    localObject1 = new ArrayList();
    Iterator localIterator = paramPutDataRequest.getAssets().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject3 = (Asset)localEntry.getValue();
      Object localObject4;
      if (((Asset)localObject3).getData() != null) {
        try
        {
          localObject4 = ParcelFileDescriptor.createPipe();
          if (Log.isLoggable("WearableClient", 3)) {
            Log.d("WearableClient", "processAssets: replacing data with FD in asset: " + localObject3 + " read:" + localObject4[0] + " write:" + localObject4[1]);
          }
          ((PutDataRequest)localObject2).putAsset((String)localEntry.getKey(), Asset.createFromFd(localObject4[0]));
          localObject3 = zza(localObject4[1], ((Asset)localObject3).getData());
          ((List)localObject1).add(localObject3);
          zzbkn.submit((Runnable)localObject3);
        }
        catch (IOException paramzzb)
        {
          throw new IllegalStateException("Unable to create ParcelFileDescriptor for asset in request: " + paramPutDataRequest, paramzzb);
        }
      } else if (((Asset)localObject3).getUri() != null) {
        try
        {
          localObject4 = Asset.createFromFd(getContext().getContentResolver().openFileDescriptor(((Asset)localObject3).getUri(), "r"));
          ((PutDataRequest)localObject2).putAsset((String)localEntry.getKey(), (Asset)localObject4);
        }
        catch (FileNotFoundException paramPutDataRequest)
        {
          new zzbo.zzq(paramzzb, (List)localObject1).zza(new PutDataResponse(4005, null));
          Log.w("WearableClient", "Couldn't resolve asset URI: " + ((Asset)localObject3).getUri());
          return;
        }
      } else {
        ((PutDataRequest)localObject2).putAsset((String)localEntry.getKey(), (Asset)localObject3);
      }
    }
    ((zzax)zzqJ()).zza(new zzbo.zzq(paramzzb, (List)localObject1), (PutDataRequest)localObject2);
  }
  
  public void zza(zza.zzb paramzzb, String paramString, Uri paramUri, long paramLong1, long paramLong2)
  {
    try
    {
      zzbkn.execute(zzb(paramzzb, paramString, paramUri, paramLong1, paramLong2));
      return;
    }
    catch (RuntimeException paramString)
    {
      paramzzb.zzw(new Status(8));
      throw paramString;
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString, Uri paramUri, boolean paramBoolean)
  {
    try
    {
      zzbkn.execute(zzb(paramzzb, paramString, paramUri, paramBoolean));
      return;
    }
    catch (RuntimeException paramString)
    {
      paramzzb.zzw(new Status(8));
      throw paramString;
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    ((zzax)zzqJ()).zza(new zzbo.zzt(paramzzb), paramString1, paramString2, paramArrayOfByte);
  }
  
  public void zzb(zza.zzb paramzzb, int paramInt)
  {
    ((zzax)zzqJ()).zza(new zzbo.zzf(paramzzb), paramInt);
  }
  
  public void zzb(zza.zzb paramzzb, Uri paramUri, int paramInt)
  {
    ((zzax)zzqJ()).zzb(new zzbo.zze(paramzzb), paramUri, paramInt);
  }
  
  public void zze(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    ((zzax)zzqJ()).zza(new zzbo.zzp(paramzzb), paramString1, paramString2);
  }
  
  protected zzax zzew(IBinder paramIBinder)
  {
    return zzax.zza.zzeu(paramIBinder);
  }
  
  public void zzg(zza.zzb paramzzb, String paramString, int paramInt)
  {
    ((zzax)zzqJ()).zza(new zzbo.zzg(paramzzb), paramString, paramInt);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.wearable.BIND";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.wearable.internal.IWearableService";
  }
  
  public void zzh(zza.zzb paramzzb, String paramString, int paramInt)
  {
    ((zzax)zzqJ()).zzb(new zzbo.zzd(paramzzb), paramString, paramInt);
  }
  
  public void zzr(zza.zzb paramzzb)
  {
    ((zzax)zzqJ()).zzb(new zzbo.zzl(paramzzb));
  }
  
  public void zzr(zza.zzb paramzzb, String paramString)
  {
    ((zzax)zzqJ()).zzd(new zzbo.zza(paramzzb), paramString);
  }
  
  public void zzs(zza.zzb paramzzb)
  {
    ((zzax)zzqJ()).zzc(new zzbo.zzn(paramzzb));
  }
  
  public void zzs(zza.zzb paramzzb, String paramString)
  {
    ((zzax)zzqJ()).zze(new zzbo.zzs(paramzzb), paramString);
  }
  
  public void zzt(zza.zzb paramzzb)
  {
    ((zzax)zzqJ()).zzd(new zzbo.zzj(paramzzb));
  }
  
  public void zzt(zza.zzb paramzzb, String paramString)
  {
    ((zzax)zzqJ()).zzf(new zzbo.zzc(paramzzb), paramString);
  }
  
  public void zzu(zza.zzb paramzzb, String paramString)
  {
    zzt localzzt = new zzt();
    ((zzax)zzqJ()).zza(new zzbo.zzh(paramzzb, localzzt), localzzt, paramString);
  }
  
  public void zzv(zza.zzb paramzzb, String paramString)
  {
    zzt localzzt = new zzt();
    ((zzax)zzqJ()).zzb(new zzbo.zzi(paramzzb, localzzt), localzzt, paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */