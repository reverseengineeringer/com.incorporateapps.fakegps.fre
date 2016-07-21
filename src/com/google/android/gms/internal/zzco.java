package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzco
  extends NativeContentAd
{
  private final List zzyN = new ArrayList();
  private final zzcn zzyP;
  private final zzci zzyQ;
  
  public zzco(zzcn paramzzcn)
  {
    zzyP = paramzzcn;
    try
    {
      paramzzcn = zzyP.getImages();
      if (paramzzcn != null)
      {
        paramzzcn = paramzzcn.iterator();
        while (paramzzcn.hasNext())
        {
          zzch localzzch = zzc(paramzzcn.next());
          if (localzzch != null) {
            zzyN.add(new zzci(localzzch));
          }
        }
      }
      try
      {
        paramzzcn = zzyP.zzdO();
        if (paramzzcn == null) {
          break label129;
        }
        paramzzcn = new zzci(paramzzcn);
      }
      catch (RemoteException paramzzcn)
      {
        for (;;)
        {
          zzb.zzb("Failed to get icon.", paramzzcn);
          paramzzcn = null;
        }
      }
    }
    catch (RemoteException paramzzcn)
    {
      zzb.zzb("Failed to get image.", paramzzcn);
    }
    zzyQ = paramzzcn;
  }
  
  public void destroy()
  {
    try
    {
      zzyP.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to destroy", localRemoteException);
    }
  }
  
  public CharSequence getAdvertiser()
  {
    try
    {
      String str = zzyP.getAdvertiser();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get attribution.", localRemoteException);
    }
    return null;
  }
  
  public CharSequence getBody()
  {
    try
    {
      String str = zzyP.getBody();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get body.", localRemoteException);
    }
    return null;
  }
  
  public CharSequence getCallToAction()
  {
    try
    {
      String str = zzyP.getCallToAction();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get call to action.", localRemoteException);
    }
    return null;
  }
  
  public Bundle getExtras()
  {
    try
    {
      Bundle localBundle = zzyP.getExtras();
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Failed to get extras", localRemoteException);
    }
    return null;
  }
  
  public CharSequence getHeadline()
  {
    try
    {
      String str = zzyP.getHeadline();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get headline.", localRemoteException);
    }
    return null;
  }
  
  public List getImages()
  {
    return zzyN;
  }
  
  public NativeAd.Image getLogo()
  {
    return zzyQ;
  }
  
  zzch zzc(Object paramObject)
  {
    if ((paramObject instanceof IBinder)) {
      return zzch.zza.zzt((IBinder)paramObject);
    }
    return null;
  }
  
  protected zzd zzdL()
  {
    try
    {
      zzd localzzd = zzyP.zzdL();
      return localzzd;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to retrieve native ad engine.", localRemoteException);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzco
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */