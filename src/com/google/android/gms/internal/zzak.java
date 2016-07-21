package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.ads.a.a.d;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

public abstract class zzak
  implements zzaj
{
  protected static GoogleApiClient zznG;
  protected long zznA = 0L;
  protected long zznB = 0L;
  protected long zznC = 0L;
  private boolean zznD = false;
  protected DisplayMetrics zznE;
  protected zzap zznF;
  protected MotionEvent zznx;
  protected LinkedList zzny = new LinkedList();
  protected long zznz = 0L;
  
  protected zzak(Context paramContext, zzap paramzzap)
  {
    zznF = paramzzap;
    try
    {
      zznE = paramContext.getResources().getDisplayMetrics();
      return;
    }
    catch (UnsupportedOperationException paramContext)
    {
      zznE = new DisplayMetrics();
      zznE.density = 1.0F;
    }
  }
  
  private String zza(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      paramContext = zzd(paramContext);
      zznD = true;
      while ((paramContext == null) || (paramContext.getSerializedSize() == 0))
      {
        return Integer.toString(5);
        paramContext = zzc(paramContext);
      }
      paramContext = zza(paramContext, paramString);
      return paramContext;
    }
    catch (NoSuchAlgorithmException paramContext)
    {
      return Integer.toString(7);
    }
    catch (UnsupportedEncodingException paramContext)
    {
      return Integer.toString(7);
    }
    catch (IOException paramContext) {}
    return Integer.toString(3);
  }
  
  protected String zza(d paramd, String paramString)
  {
    return zza(zzsu.toByteArray(paramd), paramString);
  }
  
  String zza(byte[] paramArrayOfByte, String paramString)
  {
    Object localObject = paramArrayOfByte;
    if (paramArrayOfByte.length > 239)
    {
      paramArrayOfByte = new d();
      t = Long.valueOf(1L);
      localObject = zzsu.toByteArray(paramArrayOfByte);
    }
    if (localObject.length < 239)
    {
      paramArrayOfByte = new byte[239 - localObject.length];
      new SecureRandom().nextBytes(paramArrayOfByte);
    }
    for (paramArrayOfByte = ByteBuffer.allocate(240).put((byte)localObject.length).put((byte[])localObject).put(paramArrayOfByte).array();; paramArrayOfByte = ByteBuffer.allocate(240).put((byte)localObject.length).put((byte[])localObject).array())
    {
      localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      localObject = ((MessageDigest)localObject).digest();
      paramArrayOfByte = ByteBuffer.allocate(256).put((byte[])localObject).put(paramArrayOfByte).array();
      localObject = new byte['Ā'];
      new zzai().zzb(paramArrayOfByte, (byte[])localObject);
      if ((paramString != null) && (paramString.length() > 0)) {
        zza(paramString, (byte[])localObject);
      }
      return zznF.zza((byte[])localObject, true);
    }
  }
  
  public void zza(int paramInt1, int paramInt2, int paramInt3)
  {
    if (zznx != null) {
      zznx.recycle();
    }
    zznx = MotionEvent.obtain(0L, paramInt3, 1, paramInt1 * zznE.density, paramInt2 * zznE.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
  }
  
  public void zza(MotionEvent paramMotionEvent)
  {
    if (zznD)
    {
      zznC = 0L;
      zznB = 0L;
      zznA = 0L;
      zznz = 0L;
      Iterator localIterator = zzny.iterator();
      while (localIterator.hasNext()) {
        ((MotionEvent)localIterator.next()).recycle();
      }
      zzny.clear();
      zznx = null;
      zznD = false;
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
      return;
    case 1: 
      zznx = MotionEvent.obtain(paramMotionEvent);
      zzny.add(zznx);
      if (zzny.size() > 6) {
        ((MotionEvent)zzny.remove()).recycle();
      }
      zznB += 1L;
      return;
    case 0: 
      zznz += 1L;
      return;
    case 3: 
      zznC += 1L;
      return;
    }
    zznA += paramMotionEvent.getHistorySize() + 1;
  }
  
  void zza(String paramString, byte[] paramArrayOfByte)
  {
    String str = paramString;
    if (paramString.length() > 32) {
      str = paramString.substring(0, 32);
    }
    new zzsl(str.getBytes("UTF-8")).zzC(paramArrayOfByte);
  }
  
  public String zzb(Context paramContext)
  {
    return zza(paramContext, null, false);
  }
  
  public String zzb(Context paramContext, String paramString)
  {
    return zza(paramContext, paramString, true);
  }
  
  protected abstract d zzc(Context paramContext);
  
  protected abstract d zzd(Context paramContext);
  
  protected String zzk(String paramString)
  {
    Object localObject = paramString;
    if (paramString != null)
    {
      localObject = paramString;
      if (paramString.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"))
      {
        paramString = UUID.fromString(paramString);
        localObject = new byte[16];
        ByteBuffer localByteBuffer = ByteBuffer.wrap((byte[])localObject);
        localByteBuffer.putLong(paramString.getMostSignificantBits());
        localByteBuffer.putLong(paramString.getLeastSignificantBits());
        localObject = zznF.zza((byte[])localObject, true);
      }
    }
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */