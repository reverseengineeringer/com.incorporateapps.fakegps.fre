package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzcm
  extends NativeAppInstallAd
{
  private final zzcl zzyM;
  private final List zzyN = new ArrayList();
  private final zzci zzyO;
  
  public zzcm(zzcl paramzzcl)
  {
    zzyM = paramzzcl;
    try
    {
      paramzzcl = zzyM.getImages();
      if (paramzzcl != null)
      {
        paramzzcl = paramzzcl.iterator();
        while (paramzzcl.hasNext())
        {
          zzch localzzch = zzc(paramzzcl.next());
          if (localzzch != null) {
            zzyN.add(new zzci(localzzch));
          }
        }
      }
      try
      {
        paramzzcl = zzyM.zzdK();
        if (paramzzcl == null) {
          break label129;
        }
        paramzzcl = new zzci(paramzzcl);
      }
      catch (RemoteException paramzzcl)
      {
        for (;;)
        {
          zzb.zzb("Failed to get icon.", paramzzcl);
          paramzzcl = null;
        }
      }
    }
    catch (RemoteException paramzzcl)
    {
      zzb.zzb("Failed to get image.", paramzzcl);
    }
    zzyO = paramzzcl;
  }
  
  public void destroy()
  {
    try
    {
      zzyM.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to destroy", localRemoteException);
    }
  }
  
  public CharSequence getBody()
  {
    try
    {
      String str = zzyM.getBody();
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
      String str = zzyM.getCallToAction();
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
      Bundle localBundle = zzyM.getExtras();
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get extras", localRemoteException);
    }
    return null;
  }
  
  public CharSequence getHeadline()
  {
    try
    {
      String str = zzyM.getHeadline();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get headline.", localRemoteException);
    }
    return null;
  }
  
  public NativeAd.Image getIcon()
  {
    return zzyO;
  }
  
  public List getImages()
  {
    return zzyN;
  }
  
  public CharSequence getPrice()
  {
    try
    {
      String str = zzyM.getPrice();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get price.", localRemoteException);
    }
    return null;
  }
  
  public Double getStarRating()
  {
    try
    {
      double d = zzyM.getStarRating();
      if (d == -1.0D) {
        return null;
      }
      return Double.valueOf(d);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get star rating.", localRemoteException);
    }
    return null;
  }
  
  public CharSequence getStore()
  {
    try
    {
      String str = zzyM.getStore();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get store", localRemoteException);
    }
    return null;
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
      zzd localzzd = zzyM.zzdL();
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
 * Qualified Name:     com.google.android.gms.internal.zzcm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */