package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import com.google.android.gms.common.api.PendingResult;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager
{
  private static TagManager zzblm;
  private final Context mContext;
  private final DataLayer zzbhN;
  private final zzs zzbkh;
  private final TagManager.zza zzblj;
  private final zzct zzblk;
  private final ConcurrentMap zzbll;
  
  TagManager(Context paramContext, TagManager.zza paramzza, DataLayer paramDataLayer, zzct paramzzct)
  {
    if (paramContext == null) {
      throw new NullPointerException("context cannot be null");
    }
    mContext = paramContext.getApplicationContext();
    zzblk = paramzzct;
    zzblj = paramzza;
    zzbll = new ConcurrentHashMap();
    zzbhN = paramDataLayer;
    zzbhN.zza(new TagManager.1(this));
    zzbhN.zza(new zzd(mContext));
    zzbkh = new zzs();
    zzHt();
  }
  
  public static TagManager getInstance(Context paramContext)
  {
    try
    {
      if (zzblm != null) {
        break label68;
      }
      if (paramContext == null)
      {
        zzbg.e("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
      }
    }
    finally {}
    zzblm = new TagManager(paramContext, new TagManager.2(), new DataLayer(new zzw(paramContext)), zzcu.zzHo());
    label68:
    paramContext = zzblm;
    return paramContext;
  }
  
  private void zzHt()
  {
    if (Build.VERSION.SDK_INT >= 14) {
      mContext.registerComponentCallbacks(new TagManager.3(this));
    }
  }
  
  private void zzgp(String paramString)
  {
    Iterator localIterator = zzbll.keySet().iterator();
    while (localIterator.hasNext()) {
      ((zzo)localIterator.next()).zzfR(paramString);
    }
  }
  
  public void dispatch()
  {
    zzblk.dispatch();
  }
  
  public DataLayer getDataLayer()
  {
    return zzbhN;
  }
  
  public PendingResult loadContainerDefaultOnly(String paramString, int paramInt)
  {
    paramString = zzblj.zza(mContext, this, null, paramString, paramInt, zzbkh);
    paramString.zzGg();
    return paramString;
  }
  
  public PendingResult loadContainerDefaultOnly(String paramString, int paramInt, Handler paramHandler)
  {
    paramString = zzblj.zza(mContext, this, paramHandler.getLooper(), paramString, paramInt, zzbkh);
    paramString.zzGg();
    return paramString;
  }
  
  public PendingResult loadContainerPreferFresh(String paramString, int paramInt)
  {
    paramString = zzblj.zza(mContext, this, null, paramString, paramInt, zzbkh);
    paramString.zzGi();
    return paramString;
  }
  
  public PendingResult loadContainerPreferFresh(String paramString, int paramInt, Handler paramHandler)
  {
    paramString = zzblj.zza(mContext, this, paramHandler.getLooper(), paramString, paramInt, zzbkh);
    paramString.zzGi();
    return paramString;
  }
  
  public PendingResult loadContainerPreferNonDefault(String paramString, int paramInt)
  {
    paramString = zzblj.zza(mContext, this, null, paramString, paramInt, zzbkh);
    paramString.zzGh();
    return paramString;
  }
  
  public PendingResult loadContainerPreferNonDefault(String paramString, int paramInt, Handler paramHandler)
  {
    paramString = zzblj.zza(mContext, this, paramHandler.getLooper(), paramString, paramInt, zzbkh);
    paramString.zzGh();
    return paramString;
  }
  
  public void setVerboseLoggingEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 2;; i = 5)
    {
      zzbg.setLogLevel(i);
      return;
    }
  }
  
  public void zza(zzo paramzzo)
  {
    zzbll.put(paramzzo, Boolean.valueOf(true));
  }
  
  public boolean zzb(zzo paramzzo)
  {
    return zzbll.remove(paramzzo) != null;
  }
  
  boolean zzp(Uri paramUri)
  {
    for (;;)
    {
      boolean bool;
      Object localObject2;
      try
      {
        localObject1 = zzcb.zzGU();
        if (!((zzcb)localObject1).zzp(paramUri)) {
          break label229;
        }
        paramUri = ((zzcb)localObject1).getContainerId();
        int i = TagManager.4.zzblo[localObject1.zzGV().ordinal()];
        switch (i)
        {
        default: 
          bool = true;
          return bool;
        }
      }
      finally {}
      Object localObject1 = zzbll.keySet().iterator();
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zzo)((Iterator)localObject1).next();
        if (((zzo)localObject2).getContainerId().equals(paramUri))
        {
          ((zzo)localObject2).zzfT(null);
          ((zzo)localObject2).refresh();
        }
      }
      else
      {
        continue;
        localObject2 = zzbll.keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          zzo localzzo = (zzo)((Iterator)localObject2).next();
          if (localzzo.getContainerId().equals(paramUri))
          {
            localzzo.zzfT(((zzcb)localObject1).zzGW());
            localzzo.refresh();
          }
          else if (localzzo.zzGd() != null)
          {
            localzzo.zzfT(null);
            localzzo.refresh();
          }
        }
        continue;
        label229:
        bool = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.TagManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */