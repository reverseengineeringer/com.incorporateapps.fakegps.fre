package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class zzay
  extends zzak
{
  private static final String ID = zzad.zzcd.toString();
  private static final String zzbiQ = zzae.zzdV.toString();
  private static final String zzbji = zzae.zzfU.toString();
  private static final String zzbjj = zzae.zzfY.toString();
  private static final String zzbjk = zzae.zzfr.toString();
  
  public zzay()
  {
    super(ID, new String[] { zzbiQ });
  }
  
  private String zza(String paramString, zzay.zza paramzza, Set paramSet)
  {
    switch (zzay.1.zzbjl[paramzza.ordinal()])
    {
    default: 
      return paramString;
    case 1: 
      try
      {
        paramzza = zzdj.zzgA(paramString);
        return paramzza;
      }
      catch (UnsupportedEncodingException paramzza)
      {
        zzbg.zzb("Joiner: unsupported encoding", paramzza);
        return paramString;
      }
    }
    paramString = paramString.replace("\\", "\\\\");
    paramzza = paramSet.iterator();
    while (paramzza.hasNext())
    {
      paramSet = ((Character)paramzza.next()).toString();
      paramString = paramString.replace(paramSet, "\\" + paramSet);
    }
    return paramString;
  }
  
  private void zza(StringBuilder paramStringBuilder, String paramString, zzay.zza paramzza, Set paramSet)
  {
    paramStringBuilder.append(zza(paramString, paramzza, paramSet));
  }
  
  private void zza(Set paramSet, String paramString)
  {
    int i = 0;
    while (i < paramString.length())
    {
      paramSet.add(Character.valueOf(paramString.charAt(i)));
      i += 1;
    }
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    zzag.zza localzza = (zzag.zza)paramMap.get(zzbiQ);
    if (localzza == null) {
      return zzdf.zzHF();
    }
    Object localObject1 = (zzag.zza)paramMap.get(zzbji);
    String str1;
    Object localObject2;
    if (localObject1 != null)
    {
      str1 = zzdf.zzg((zzag.zza)localObject1);
      localObject1 = (zzag.zza)paramMap.get(zzbjj);
      if (localObject1 == null) {
        break label186;
      }
      localObject2 = zzdf.zzg((zzag.zza)localObject1);
      label75:
      localObject1 = zzay.zza.zzbjm;
      paramMap = (zzag.zza)paramMap.get(zzbjk);
      if (paramMap == null) {
        break label415;
      }
      paramMap = zzdf.zzg(paramMap);
      if (!"url".equals(paramMap)) {
        break label193;
      }
      localObject1 = zzay.zza.zzbjn;
      paramMap = null;
    }
    for (;;)
    {
      label118:
      StringBuilder localStringBuilder = new StringBuilder();
      switch (type)
      {
      default: 
        zza(localStringBuilder, zzdf.zzg(localzza), (zzay.zza)localObject1, paramMap);
      }
      for (;;)
      {
        return zzdf.zzR(localStringBuilder.toString());
        str1 = "";
        break;
        label186:
        localObject2 = "=";
        break label75;
        label193:
        if ("backslash".equals(paramMap))
        {
          localObject1 = zzay.zza.zzbjo;
          paramMap = new HashSet();
          zza(paramMap, str1);
          zza(paramMap, (String)localObject2);
          paramMap.remove(Character.valueOf('\\'));
          break label118;
        }
        zzbg.e("Joiner: unsupported escape type: " + paramMap);
        return zzdf.zzHF();
        int j = 1;
        localObject2 = zzjy;
        int k = localObject2.length;
        int i = 0;
        while (i < k)
        {
          localzza = localObject2[i];
          if (j == 0) {
            localStringBuilder.append(str1);
          }
          zza(localStringBuilder, zzdf.zzg(localzza), (zzay.zza)localObject1, paramMap);
          i += 1;
          j = 0;
        }
        i = 0;
        while (i < zzjz.length)
        {
          if (i > 0) {
            localStringBuilder.append(str1);
          }
          String str2 = zzdf.zzg(zzjz[i]);
          String str3 = zzdf.zzg(zzjA[i]);
          zza(localStringBuilder, str2, (zzay.zza)localObject1, paramMap);
          localStringBuilder.append((String)localObject2);
          zza(localStringBuilder, str3, (zzay.zza)localObject1, paramMap);
          i += 1;
        }
      }
      label415:
      paramMap = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */