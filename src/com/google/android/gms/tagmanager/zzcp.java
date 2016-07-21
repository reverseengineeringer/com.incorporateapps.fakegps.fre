package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzag.zza;
import com.google.android.gms.internal.zzrs;
import com.google.android.gms.internal.zzrs.zza;
import com.google.android.gms.internal.zzrs.zzc;
import com.google.android.gms.internal.zzrs.zze;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzcp
{
  private static final zzbw zzbkq = new zzbw(zzdf.zzHF(), true);
  private final DataLayer zzbhN;
  private volatile String zzbkA;
  private int zzbkB;
  private final zzrs.zzc zzbkr;
  private final zzah zzbks;
  private final Map zzbkt;
  private final Map zzbku;
  private final Map zzbkv;
  private final zzl zzbkw;
  private final zzl zzbkx;
  private final Set zzbky;
  private final Map zzbkz;
  
  public zzcp(Context paramContext, zzrs.zzc paramzzc, DataLayer paramDataLayer, zzt.zza paramzza1, zzt.zza paramzza2, zzah paramzzah)
  {
    if (paramzzc == null) {
      throw new NullPointerException("resource cannot be null");
    }
    zzbkr = paramzzc;
    zzbky = new HashSet(paramzzc.zzHL());
    zzbhN = paramDataLayer;
    zzbks = paramzzah;
    paramzzc = new zzcp.1(this);
    zzbkw = new zzm().zza(1048576, paramzzc);
    paramzzc = new zzcp.2(this);
    zzbkx = new zzm().zza(1048576, paramzzc);
    zzbkt = new HashMap();
    zzb(new zzj(paramContext));
    zzb(new zzt(paramzza2));
    zzb(new zzx(paramDataLayer));
    zzb(new zzdg(paramContext, paramDataLayer));
    zzb(new zzdb(paramContext, paramDataLayer));
    zzbku = new HashMap();
    zzc(new zzr());
    zzc(new zzae());
    zzc(new zzaf());
    zzc(new zzam());
    zzc(new zzan());
    zzc(new zzbc());
    zzc(new zzbd());
    zzc(new zzcf());
    zzc(new zzcy());
    zzbkv = new HashMap();
    zza(new zzb(paramContext));
    zza(new zzc(paramContext));
    zza(new zze(paramContext));
    zza(new zzf(paramContext));
    zza(new zzg(paramContext));
    zza(new zzh(paramContext));
    zza(new zzi(paramContext));
    zza(new zzn());
    zza(new zzq(zzbkr.getVersion()));
    zza(new zzt(paramzza1));
    zza(new zzv(paramDataLayer));
    zza(new zzaa(paramContext));
    zza(new zzab());
    zza(new zzad());
    zza(new zzai(this));
    zza(new zzao());
    zza(new zzap());
    zza(new zzaw(paramContext));
    zza(new zzay());
    zza(new zzbb());
    zza(new zzbi());
    zza(new zzbk(paramContext));
    zza(new zzbx());
    zza(new zzbz());
    zza(new zzcc());
    zza(new zzce());
    zza(new zzcg(paramContext));
    zza(new zzcq());
    zza(new zzcr());
    zza(new zzda());
    zza(new zzdh());
    zzbkz = new HashMap();
    paramDataLayer = zzbky.iterator();
    while (paramDataLayer.hasNext())
    {
      paramzza1 = (zzrs.zze)paramDataLayer.next();
      if (paramzzah.zzGA())
      {
        zza(paramzza1.zzHT(), paramzza1.zzHU(), "add macro");
        zza(paramzza1.zzHY(), paramzza1.zzHV(), "remove macro");
        zza(paramzza1.zzHR(), paramzza1.zzHW(), "add tag");
        zza(paramzza1.zzHS(), paramzza1.zzHX(), "remove tag");
      }
      int i = 0;
      while (i < paramzza1.zzHT().size())
      {
        paramzza2 = (zzrs.zza)paramzza1.zzHT().get(i);
        paramzzc = "Unknown";
        paramContext = paramzzc;
        if (paramzzah.zzGA())
        {
          paramContext = paramzzc;
          if (i < paramzza1.zzHU().size()) {
            paramContext = (String)paramzza1.zzHU().get(i);
          }
        }
        paramzzc = zzi(zzbkz, zza(paramzza2));
        paramzzc.zza(paramzza1);
        paramzzc.zza(paramzza1, paramzza2);
        paramzzc.zza(paramzza1, paramContext);
        i += 1;
      }
      i = 0;
      while (i < paramzza1.zzHY().size())
      {
        paramzza2 = (zzrs.zza)paramzza1.zzHY().get(i);
        paramzzc = "Unknown";
        paramContext = paramzzc;
        if (paramzzah.zzGA())
        {
          paramContext = paramzzc;
          if (i < paramzza1.zzHV().size()) {
            paramContext = (String)paramzza1.zzHV().get(i);
          }
        }
        paramzzc = zzi(zzbkz, zza(paramzza2));
        paramzzc.zza(paramzza1);
        paramzzc.zzb(paramzza1, paramzza2);
        paramzzc.zzb(paramzza1, paramContext);
        i += 1;
      }
    }
    paramContext = zzbkr.zzHM().entrySet().iterator();
    while (paramContext.hasNext())
    {
      paramzzc = (Map.Entry)paramContext.next();
      paramDataLayer = ((List)paramzzc.getValue()).iterator();
      while (paramDataLayer.hasNext())
      {
        paramzza1 = (zzrs.zza)paramDataLayer.next();
        if (!zzdf.zzk((zzag.zza)paramzza1.zzHI().get(com.google.android.gms.internal.zzae.zzgt.toString())).booleanValue()) {
          zzi(zzbkz, (String)paramzzc.getKey()).zzb(paramzza1);
        }
      }
    }
  }
  
  private String zzHf()
  {
    if (zzbkB <= 1) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Integer.toString(zzbkB));
    int i = 2;
    while (i < zzbkB)
    {
      localStringBuilder.append(' ');
      i += 1;
    }
    localStringBuilder.append(": ");
    return localStringBuilder.toString();
  }
  
  private zzbw zza(zzag.zza paramzza, Set paramSet, zzdi paramzzdi)
  {
    if (!zzjH) {
      return new zzbw(paramzza, true);
    }
    zzbw localzzbw1;
    switch (type)
    {
    case 5: 
    case 6: 
    default: 
      zzbg.e("Unknown type: " + type);
      return zzbkq;
    case 2: 
      localzza = zzrs.zzo(paramzza);
      zzjy = new zzag.zza[zzjy.length];
      i = 0;
      while (i < zzjy.length)
      {
        localzzbw1 = zza(zzjy[i], paramSet, paramzzdi.zzkh(i));
        if (localzzbw1 == zzbkq) {
          return zzbkq;
        }
        zzjy[i] = ((zzag.zza)localzzbw1.getObject());
        i += 1;
      }
      return new zzbw(localzza, false);
    case 3: 
      localzza = zzrs.zzo(paramzza);
      if (zzjz.length != zzjA.length)
      {
        zzbg.e("Invalid serving value: " + paramzza.toString());
        return zzbkq;
      }
      zzjz = new zzag.zza[zzjz.length];
      zzjA = new zzag.zza[zzjz.length];
      i = 0;
      while (i < zzjz.length)
      {
        localzzbw1 = zza(zzjz[i], paramSet, paramzzdi.zzki(i));
        zzbw localzzbw2 = zza(zzjA[i], paramSet, paramzzdi.zzkj(i));
        if ((localzzbw1 == zzbkq) || (localzzbw2 == zzbkq)) {
          return zzbkq;
        }
        zzjz[i] = ((zzag.zza)localzzbw1.getObject());
        zzjA[i] = ((zzag.zza)localzzbw2.getObject());
        i += 1;
      }
      return new zzbw(localzza, false);
    case 4: 
      if (paramSet.contains(zzjB))
      {
        zzbg.e("Macro cycle detected.  Current macro reference: " + zzjB + ".  Previous macro references: " + paramSet.toString() + ".");
        return zzbkq;
      }
      paramSet.add(zzjB);
      paramzzdi = zzdj.zza(zza(zzjB, paramSet, paramzzdi.zzGO()), zzjG);
      paramSet.remove(zzjB);
      return paramzzdi;
    }
    zzag.zza localzza = zzrs.zzo(paramzza);
    zzjF = new zzag.zza[zzjF.length];
    int i = 0;
    while (i < zzjF.length)
    {
      localzzbw1 = zza(zzjF[i], paramSet, paramzzdi.zzkk(i));
      if (localzzbw1 == zzbkq) {
        return zzbkq;
      }
      zzjF[i] = ((zzag.zza)localzzbw1.getObject());
      i += 1;
    }
    return new zzbw(localzza, false);
  }
  
  private zzbw zza(String paramString, Set paramSet, zzbj paramzzbj)
  {
    zzbkB += 1;
    Object localObject = (zzcp.zzb)zzbkx.get(paramString);
    if ((localObject != null) && (!zzbks.zzGA()))
    {
      zza(((zzcp.zzb)localObject).zzHh(), paramSet);
      zzbkB -= 1;
      return ((zzcp.zzb)localObject).zzHg();
    }
    localObject = (zzcp.zzc)zzbkz.get(paramString);
    if (localObject == null)
    {
      zzbg.e(zzHf() + "Invalid macro: " + paramString);
      zzbkB -= 1;
      return zzbkq;
    }
    zzbw localzzbw = zza(paramString, ((zzcp.zzc)localObject).zzHi(), ((zzcp.zzc)localObject).zzHj(), ((zzcp.zzc)localObject).zzHk(), ((zzcp.zzc)localObject).zzHm(), ((zzcp.zzc)localObject).zzHl(), paramSet, paramzzbj.zzGq());
    if (((Set)localzzbw.getObject()).isEmpty()) {}
    for (localObject = ((zzcp.zzc)localObject).zzHn(); localObject == null; localObject = (zzrs.zza)((Set)localzzbw.getObject()).iterator().next())
    {
      zzbkB -= 1;
      return zzbkq;
      if (((Set)localzzbw.getObject()).size() > 1) {
        zzbg.zzaK(zzHf() + "Multiple macros active for macroName " + paramString);
      }
    }
    paramzzbj = zza(zzbkv, (zzrs.zza)localObject, paramSet, paramzzbj.zzGG());
    boolean bool;
    if ((localzzbw.zzGP()) && (paramzzbj.zzGP()))
    {
      bool = true;
      if (paramzzbj != zzbkq) {
        break label392;
      }
    }
    label392:
    for (paramzzbj = zzbkq;; paramzzbj = new zzbw(paramzzbj.getObject(), bool))
    {
      localObject = ((zzrs.zza)localObject).zzHh();
      if (paramzzbj.zzGP()) {
        zzbkx.zzh(paramString, new zzcp.zzb(paramzzbj, (zzag.zza)localObject));
      }
      zza((zzag.zza)localObject, paramSet);
      zzbkB -= 1;
      return paramzzbj;
      bool = false;
      break;
    }
  }
  
  private zzbw zza(Map paramMap, zzrs.zza paramzza, Set paramSet, zzch paramzzch)
  {
    boolean bool = true;
    Object localObject1 = (zzag.zza)paramzza.zzHI().get(com.google.android.gms.internal.zzae.zzfG.toString());
    if (localObject1 == null)
    {
      zzbg.e("No function id in properties");
      paramMap = zzbkq;
    }
    zzak localzzak;
    do
    {
      return paramMap;
      localObject1 = zzjC;
      localzzak = (zzak)paramMap.get(localObject1);
      if (localzzak == null)
      {
        zzbg.e((String)localObject1 + " has no backing implementation.");
        return zzbkq;
      }
      paramMap = (zzbw)zzbkw.get(paramzza);
    } while ((paramMap != null) && (!zzbks.zzGA()));
    paramMap = new HashMap();
    Iterator localIterator = paramzza.zzHI().entrySet().iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject2 = paramzzch.zzgj((String)localEntry.getKey());
      localObject2 = zza((zzag.zza)localEntry.getValue(), paramSet, ((zzcj)localObject2).zze((zzag.zza)localEntry.getValue()));
      if (localObject2 == zzbkq) {
        return zzbkq;
      }
      if (((zzbw)localObject2).zzGP()) {
        paramzza.zza((String)localEntry.getKey(), (zzag.zza)((zzbw)localObject2).getObject());
      }
      for (;;)
      {
        paramMap.put(localEntry.getKey(), ((zzbw)localObject2).getObject());
        break;
        i = 0;
      }
    }
    if (!localzzak.zze(paramMap.keySet()))
    {
      zzbg.e("Incorrect keys for function " + (String)localObject1 + " required " + localzzak.zzGC() + " had " + paramMap.keySet());
      return zzbkq;
    }
    if ((i != 0) && (localzzak.zzFW())) {}
    for (;;)
    {
      paramMap = new zzbw(localzzak.zzP(paramMap), bool);
      if (bool) {
        zzbkw.zzh(paramzza, paramMap);
      }
      paramzzch.zzd((zzag.zza)paramMap.getObject());
      return paramMap;
      bool = false;
    }
  }
  
  private zzbw zza(Set paramSet1, Set paramSet2, zzcp.zza paramzza, zzco paramzzco)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    paramSet1 = paramSet1.iterator();
    boolean bool = true;
    if (paramSet1.hasNext())
    {
      zzrs.zze localzze = (zzrs.zze)paramSet1.next();
      zzck localzzck = paramzzco.zzGN();
      zzbw localzzbw = zza(localzze, paramSet2, localzzck);
      if (((Boolean)localzzbw.getObject()).booleanValue()) {
        paramzza.zza(localzze, localHashSet1, localHashSet2, localzzck);
      }
      if ((bool) && (localzzbw.zzGP())) {}
      for (bool = true;; bool = false) {
        break;
      }
    }
    localHashSet1.removeAll(localHashSet2);
    paramzzco.zzf(localHashSet1);
    return new zzbw(localHashSet1, bool);
  }
  
  private static String zza(zzrs.zza paramzza)
  {
    return zzdf.zzg((zzag.zza)paramzza.zzHI().get(com.google.android.gms.internal.zzae.zzfR.toString()));
  }
  
  private void zza(zzag.zza paramzza, Set paramSet)
  {
    if (paramzza == null) {}
    for (;;)
    {
      return;
      paramzza = zza(paramzza, paramSet, new zzbu());
      if (paramzza != zzbkq)
      {
        paramzza = zzdf.zzl((zzag.zza)paramzza.getObject());
        if ((paramzza instanceof Map))
        {
          paramzza = (Map)paramzza;
          zzbhN.push(paramzza);
          return;
        }
        if (!(paramzza instanceof List)) {
          break;
        }
        paramzza = ((List)paramzza).iterator();
        while (paramzza.hasNext())
        {
          paramSet = paramzza.next();
          if ((paramSet instanceof Map))
          {
            paramSet = (Map)paramSet;
            zzbhN.push(paramSet);
          }
          else
          {
            zzbg.zzaK("pushAfterEvaluate: value not a Map");
          }
        }
      }
    }
    zzbg.zzaK("pushAfterEvaluate: value not a Map or List");
  }
  
  private static void zza(List paramList1, List paramList2, String paramString)
  {
    if (paramList1.size() != paramList2.size()) {
      zzbg.zzaJ("Invalid resource: imbalance of rule names of functions for " + paramString + " operation. Using default rule name instead");
    }
  }
  
  private static void zza(Map paramMap, zzak paramzzak)
  {
    if (paramMap.containsKey(paramzzak.zzGB())) {
      throw new IllegalArgumentException("Duplicate function type name: " + paramzzak.zzGB());
    }
    paramMap.put(paramzzak.zzGB(), paramzzak);
  }
  
  private static zzcp.zzc zzi(Map paramMap, String paramString)
  {
    zzcp.zzc localzzc2 = (zzcp.zzc)paramMap.get(paramString);
    zzcp.zzc localzzc1 = localzzc2;
    if (localzzc2 == null)
    {
      localzzc1 = new zzcp.zzc();
      paramMap.put(paramString, localzzc1);
    }
    return localzzc1;
  }
  
  public void zzF(List paramList)
  {
    for (;;)
    {
      try
      {
        paramList = paramList.iterator();
        if (!paramList.hasNext()) {
          break;
        }
        zzaf.zzi localzzi = (zzaf.zzi)paramList.next();
        if ((name == null) || (!name.startsWith("gaExperiment:"))) {
          zzbg.v("Ignored supplemental: " + localzzi);
        } else {
          zzaj.zza(zzbhN, localzzi);
        }
      }
      finally {}
    }
  }
  
  String zzHe()
  {
    try
    {
      String str = zzbkA;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  zzbw zza(zzrs.zza paramzza, Set paramSet, zzch paramzzch)
  {
    paramzza = zza(zzbku, paramzza, paramSet, paramzzch);
    paramSet = zzdf.zzk((zzag.zza)paramzza.getObject());
    paramzzch.zzd(zzdf.zzR(paramSet));
    return new zzbw(paramSet, paramzza.zzGP());
  }
  
  zzbw zza(zzrs.zze paramzze, Set paramSet, zzck paramzzck)
  {
    Object localObject = paramzze.zzHQ().iterator();
    boolean bool = true;
    if (((Iterator)localObject).hasNext())
    {
      zzbw localzzbw = zza((zzrs.zza)((Iterator)localObject).next(), paramSet, paramzzck.zzGH());
      if (((Boolean)localzzbw.getObject()).booleanValue())
      {
        paramzzck.zzf(zzdf.zzR(Boolean.valueOf(false)));
        return new zzbw(Boolean.valueOf(false), localzzbw.zzGP());
      }
      if ((bool) && (localzzbw.zzGP())) {}
      for (bool = true;; bool = false) {
        break;
      }
    }
    paramzze = paramzze.zzHP().iterator();
    while (paramzze.hasNext())
    {
      localObject = zza((zzrs.zza)paramzze.next(), paramSet, paramzzck.zzGI());
      if (!((Boolean)((zzbw)localObject).getObject()).booleanValue())
      {
        paramzzck.zzf(zzdf.zzR(Boolean.valueOf(false)));
        return new zzbw(Boolean.valueOf(false), ((zzbw)localObject).zzGP());
      }
      if ((bool) && (((zzbw)localObject).zzGP())) {
        bool = true;
      } else {
        bool = false;
      }
    }
    paramzzck.zzf(zzdf.zzR(Boolean.valueOf(true)));
    return new zzbw(Boolean.valueOf(true), bool);
  }
  
  zzbw zza(String paramString, Set paramSet1, Map paramMap1, Map paramMap2, Map paramMap3, Map paramMap4, Set paramSet2, zzco paramzzco)
  {
    return zza(paramSet1, paramSet2, new zzcp.3(this, paramMap1, paramMap2, paramMap3, paramMap4), paramzzco);
  }
  
  zzbw zza(Set paramSet, zzco paramzzco)
  {
    return zza(paramSet, new HashSet(), new zzcp.4(this), paramzzco);
  }
  
  void zza(zzak paramzzak)
  {
    zza(zzbkv, paramzzak);
  }
  
  void zzb(zzak paramzzak)
  {
    zza(zzbkt, paramzzak);
  }
  
  void zzc(zzak paramzzak)
  {
    zza(zzbku, paramzzak);
  }
  
  public void zzfR(String paramString)
  {
    try
    {
      zzgo(paramString);
      paramString = zzbks.zzge(paramString);
      zzu localzzu = paramString.zzGy();
      Iterator localIterator = ((Set)zza(zzbky, localzzu.zzGq()).getObject()).iterator();
      while (localIterator.hasNext())
      {
        zzrs.zza localzza = (zzrs.zza)localIterator.next();
        zza(zzbkt, localzza, new HashSet(), localzzu.zzGp());
      }
      paramString.zzGz();
    }
    finally {}
    zzgo(null);
  }
  
  public zzbw zzgn(String paramString)
  {
    zzbkB = 0;
    zzag localzzag = zzbks.zzgd(paramString);
    paramString = zza(paramString, new HashSet(), localzzag.zzGx());
    localzzag.zzGz();
    return paramString;
  }
  
  void zzgo(String paramString)
  {
    try
    {
      zzbkA = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */