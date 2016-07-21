package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import com.google.android.gms.tagmanager.zzdf;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zzrs
{
  private static zzag.zza zza(int paramInt, zzaf.zzf paramzzf, zzag.zza[] paramArrayOfzza, Set paramSet)
  {
    int k = 0;
    int m = 0;
    int j = 0;
    if (paramSet.contains(Integer.valueOf(paramInt))) {
      zzgC("Value cycle detected.  Current value reference: " + paramInt + ".  Previous value references: " + paramSet + ".");
    }
    zzag.zza localzza1 = (zzag.zza)zza(zziI, paramInt, "values");
    if (paramArrayOfzza[paramInt] != null) {
      return paramArrayOfzza[paramInt];
    }
    Object localObject = null;
    paramSet.add(Integer.valueOf(paramInt));
    switch (type)
    {
    }
    for (;;)
    {
      if (localObject == null) {
        zzgC("Invalid value: " + localzza1);
      }
      paramArrayOfzza[paramInt] = localObject;
      paramSet.remove(Integer.valueOf(paramInt));
      return (zzag.zza)localObject;
      localObject = zzp(localzza1);
      zzag.zza localzza2 = zzo(localzza1);
      zzjy = new zzag.zza[zzjj.length];
      int[] arrayOfInt = zzjj;
      k = arrayOfInt.length;
      int i = 0;
      for (;;)
      {
        localObject = localzza2;
        if (j >= k) {
          break;
        }
        m = arrayOfInt[j];
        zzjy[i] = zza(m, paramzzf, paramArrayOfzza, paramSet);
        j += 1;
        i += 1;
      }
      localzza2 = zzo(localzza1);
      localObject = zzp(localzza1);
      if (zzjk.length != zzjl.length) {
        zzgC("Uneven map keys (" + zzjk.length + ") and map values (" + zzjl.length + ")");
      }
      zzjz = new zzag.zza[zzjk.length];
      zzjA = new zzag.zza[zzjk.length];
      arrayOfInt = zzjk;
      m = arrayOfInt.length;
      j = 0;
      i = 0;
      while (j < m)
      {
        int n = arrayOfInt[j];
        zzjz[i] = zza(n, paramzzf, paramArrayOfzza, paramSet);
        j += 1;
        i += 1;
      }
      arrayOfInt = zzjl;
      m = arrayOfInt.length;
      i = 0;
      j = k;
      for (;;)
      {
        localObject = localzza2;
        if (j >= m) {
          break;
        }
        k = arrayOfInt[j];
        zzjA[i] = zza(k, paramzzf, paramArrayOfzza, paramSet);
        j += 1;
        i += 1;
      }
      localObject = zzo(localzza1);
      zzjB = zzdf.zzg(zza(zzpzzjo, paramzzf, paramArrayOfzza, paramSet));
      continue;
      localzza2 = zzo(localzza1);
      localObject = zzp(localzza1);
      zzjF = new zzag.zza[zzjn.length];
      arrayOfInt = zzjn;
      k = arrayOfInt.length;
      i = 0;
      j = m;
      for (;;)
      {
        localObject = localzza2;
        if (j >= k) {
          break;
        }
        m = arrayOfInt[j];
        zzjF[i] = zza(m, paramzzf, paramArrayOfzza, paramSet);
        j += 1;
        i += 1;
      }
      localObject = localzza1;
    }
  }
  
  private static zzrs.zza zza(zzaf.zzb paramzzb, zzaf.zzf paramzzf, zzag.zza[] paramArrayOfzza, int paramInt)
  {
    zzrs.zzb localzzb = zzrs.zza.zzHH();
    paramzzb = zzit;
    int i = paramzzb.length;
    paramInt = 0;
    if (paramInt < i)
    {
      int j = paramzzb[paramInt];
      Object localObject = (zzaf.zze)zza(zziJ, Integer.valueOf(j).intValue(), "properties");
      String str = (String)zza(zziH, key, "keys");
      localObject = (zzag.zza)zza(paramArrayOfzza, value, "values");
      if (zzae.zzgU.toString().equals(str)) {
        localzzb.zzq((zzag.zza)localObject);
      }
      for (;;)
      {
        paramInt += 1;
        break;
        localzzb.zzb(str, (zzag.zza)localObject);
      }
    }
    return localzzb.zzHJ();
  }
  
  private static zzrs.zze zza(zzaf.zzg paramzzg, List paramList1, List paramList2, List paramList3, zzaf.zzf paramzzf)
  {
    zzrs.zzf localzzf = zzrs.zze.zzHO();
    int[] arrayOfInt = zziX;
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      localzzf.zzd((zzrs.zza)paramList3.get(Integer.valueOf(arrayOfInt[i]).intValue()));
      i += 1;
    }
    arrayOfInt = zziY;
    j = arrayOfInt.length;
    i = 0;
    while (i < j)
    {
      localzzf.zze((zzrs.zza)paramList3.get(Integer.valueOf(arrayOfInt[i]).intValue()));
      i += 1;
    }
    paramList3 = zziZ;
    j = paramList3.length;
    i = 0;
    while (i < j)
    {
      localzzf.zzf((zzrs.zza)paramList1.get(Integer.valueOf(paramList3[i]).intValue()));
      i += 1;
    }
    paramList3 = zzjb;
    j = paramList3.length;
    i = 0;
    int k;
    while (i < j)
    {
      k = paramList3[i];
      localzzf.zzgE(zziI[Integer.valueOf(k).intValue()].zzjx);
      i += 1;
    }
    paramList3 = zzja;
    j = paramList3.length;
    i = 0;
    while (i < j)
    {
      localzzf.zzg((zzrs.zza)paramList1.get(Integer.valueOf(paramList3[i]).intValue()));
      i += 1;
    }
    paramList1 = zzjc;
    j = paramList1.length;
    i = 0;
    while (i < j)
    {
      k = paramList1[i];
      localzzf.zzgF(zziI[Integer.valueOf(k).intValue()].zzjx);
      i += 1;
    }
    paramList1 = zzjd;
    j = paramList1.length;
    i = 0;
    while (i < j)
    {
      localzzf.zzh((zzrs.zza)paramList2.get(Integer.valueOf(paramList1[i]).intValue()));
      i += 1;
    }
    paramList1 = zzjf;
    j = paramList1.length;
    i = 0;
    while (i < j)
    {
      k = paramList1[i];
      localzzf.zzgG(zziI[Integer.valueOf(k).intValue()].zzjx);
      i += 1;
    }
    paramList1 = zzje;
    j = paramList1.length;
    i = 0;
    while (i < j)
    {
      localzzf.zzi((zzrs.zza)paramList2.get(Integer.valueOf(paramList1[i]).intValue()));
      i += 1;
    }
    paramzzg = zzjg;
    j = paramzzg.length;
    i = 0;
    while (i < j)
    {
      k = paramzzg[i];
      localzzf.zzgH(zziI[Integer.valueOf(k).intValue()].zzjx);
      i += 1;
    }
    return localzzf.zzHZ();
  }
  
  private static Object zza(Object[] paramArrayOfObject, int paramInt, String paramString)
  {
    if ((paramInt < 0) || (paramInt >= paramArrayOfObject.length)) {
      zzgC("Index out of bounds detected: " + paramInt + " in " + paramString);
    }
    return paramArrayOfObject[paramInt];
  }
  
  public static zzrs.zzc zzb(zzaf.zzf paramzzf)
  {
    int j = 0;
    Object localObject = new zzag.zza[zziI.length];
    int i = 0;
    while (i < zziI.length)
    {
      zza(i, paramzzf, (zzag.zza[])localObject, new HashSet(0));
      i += 1;
    }
    zzrs.zzd localzzd = zzrs.zzc.zzHK();
    ArrayList localArrayList1 = new ArrayList();
    i = 0;
    while (i < zziL.length)
    {
      localArrayList1.add(zza(zziL[i], paramzzf, (zzag.zza[])localObject, i));
      i += 1;
    }
    ArrayList localArrayList2 = new ArrayList();
    i = 0;
    while (i < zziM.length)
    {
      localArrayList2.add(zza(zziM[i], paramzzf, (zzag.zza[])localObject, i));
      i += 1;
    }
    ArrayList localArrayList3 = new ArrayList();
    i = 0;
    while (i < zziK.length)
    {
      zzrs.zza localzza = zza(zziK[i], paramzzf, (zzag.zza[])localObject, i);
      localzzd.zzc(localzza);
      localArrayList3.add(localzza);
      i += 1;
    }
    localObject = zziN;
    int k = localObject.length;
    i = j;
    while (i < k)
    {
      localzzd.zzb(zza(localObject[i], localArrayList1, localArrayList3, localArrayList2, paramzzf));
      i += 1;
    }
    localzzd.zzgD(version);
    localzzd.zzko(zziV);
    return localzzd.zzHN();
  }
  
  public static void zzb(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        return;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }
  
  private static void zzgC(String paramString)
  {
    zzbg.e(paramString);
    throw new zzrs.zzg(paramString);
  }
  
  public static zzag.zza zzo(zzag.zza paramzza)
  {
    zzag.zza localzza = new zzag.zza();
    type = type;
    zzjG = ((int[])zzjG.clone());
    if (zzjH) {
      zzjH = zzjH;
    }
    return localzza;
  }
  
  private static zzaf.zzh zzp(zzag.zza paramzza)
  {
    if ((zzaf.zzh)paramzza.zza(zzaf.zzh.zzjh) == null) {
      zzgC("Expected a ServingValue and didn't get one. Value is: " + paramzza);
    }
    return (zzaf.zzh)paramzza.zza(zzaf.zzh.zzjh);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */