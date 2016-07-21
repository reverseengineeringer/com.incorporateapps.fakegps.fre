package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

public class zzbc
{
  private final Object zzpV = new Object();
  private final int zzsK;
  private final int zzsL;
  private final int zzsM;
  private final zzbh zzsN;
  private ArrayList zzsO = new ArrayList();
  private ArrayList zzsP = new ArrayList();
  private int zzsQ = 0;
  private int zzsR = 0;
  private int zzsS = 0;
  private int zzsT;
  private String zzsU = "";
  private String zzsV = "";
  
  public zzbc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    zzsK = paramInt1;
    zzsL = paramInt2;
    zzsM = paramInt3;
    zzsN = new zzbh(paramInt4);
  }
  
  private String zza(ArrayList paramArrayList, int paramInt)
  {
    if (paramArrayList.isEmpty()) {
      paramArrayList = "";
    }
    Object localObject;
    do
    {
      return paramArrayList;
      localObject = new StringBuffer();
      paramArrayList = paramArrayList.iterator();
      do
      {
        if (!paramArrayList.hasNext()) {
          break;
        }
        ((StringBuffer)localObject).append((String)paramArrayList.next());
        ((StringBuffer)localObject).append(' ');
      } while (((StringBuffer)localObject).length() <= paramInt);
      ((StringBuffer)localObject).deleteCharAt(((StringBuffer)localObject).length() - 1);
      localObject = ((StringBuffer)localObject).toString();
      paramArrayList = (ArrayList)localObject;
    } while (((String)localObject).length() < paramInt);
    return ((String)localObject).substring(0, paramInt);
  }
  
  private void zze(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() < zzsM)) {
      return;
    }
    synchronized (zzpV)
    {
      zzsO.add(paramString);
      zzsQ += paramString.length();
      if (paramBoolean) {
        zzsP.add(paramString);
      }
      return;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzbc)) {}
    do
    {
      return false;
      if (paramObject == this) {
        return true;
      }
      paramObject = (zzbc)paramObject;
    } while ((((zzbc)paramObject).zzcy() == null) || (!((zzbc)paramObject).zzcy().equals(zzcy())));
    return true;
  }
  
  public int getScore()
  {
    return zzsT;
  }
  
  public int hashCode()
  {
    return zzcy().hashCode();
  }
  
  public String toString()
  {
    return "ActivityContent fetchId: " + zzsR + " score:" + zzsT + " total_length:" + zzsQ + "\n text: " + zza(zzsO, 100) + "\n viewableText" + zza(zzsP, 100) + "\n signture: " + zzsU + "\n viewableSignture: " + zzsV;
  }
  
  int zzb(int paramInt1, int paramInt2)
  {
    return zzsK * paramInt1 + zzsL * paramInt2;
  }
  
  public void zzc(String arg1, boolean paramBoolean)
  {
    zze(???, paramBoolean);
    synchronized (zzpV)
    {
      if (zzsS < 0) {
        zzin.zzaI("ActivityContent: negative number of WebViews.");
      }
      zzcD();
      return;
    }
  }
  
  public void zzcA()
  {
    synchronized (zzpV)
    {
      zzsT -= 100;
      return;
    }
  }
  
  public void zzcB()
  {
    synchronized (zzpV)
    {
      zzsS -= 1;
      return;
    }
  }
  
  public void zzcC()
  {
    synchronized (zzpV)
    {
      zzsS += 1;
      return;
    }
  }
  
  public void zzcD()
  {
    synchronized (zzpV)
    {
      int i = zzb(zzsQ, zzsR);
      if (i > zzsT)
      {
        zzsT = i;
        zzsU = zzsN.zza(zzsO);
        zzsV = zzsN.zza(zzsP);
      }
      return;
    }
  }
  
  int zzcE()
  {
    return zzsQ;
  }
  
  public boolean zzcx()
  {
    synchronized (zzpV)
    {
      if (zzsS == 0)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public String zzcy()
  {
    return zzsU;
  }
  
  public String zzcz()
  {
    return zzsV;
  }
  
  public void zzd(String paramString, boolean paramBoolean)
  {
    zze(paramString, paramBoolean);
  }
  
  public void zzh(int paramInt)
  {
    zzsR = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */