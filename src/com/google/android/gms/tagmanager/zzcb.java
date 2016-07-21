package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class zzcb
{
  private static zzcb zzbjQ;
  private volatile String zzbhM;
  private volatile zzcb.zza zzbjR;
  private volatile String zzbjS;
  private volatile String zzbjT;
  
  zzcb()
  {
    clear();
  }
  
  static zzcb zzGU()
  {
    try
    {
      if (zzbjQ == null) {
        zzbjQ = new zzcb();
      }
      zzcb localzzcb = zzbjQ;
      return localzzcb;
    }
    finally {}
  }
  
  private String zzgk(String paramString)
  {
    return paramString.split("&")[0].split("=")[1];
  }
  
  private String zzq(Uri paramUri)
  {
    return paramUri.getQuery().replace("&gtm_debug=x", "");
  }
  
  void clear()
  {
    zzbjR = zzcb.zza.zzbjU;
    zzbjS = null;
    zzbhM = null;
    zzbjT = null;
  }
  
  String getContainerId()
  {
    return zzbhM;
  }
  
  zzcb.zza zzGV()
  {
    return zzbjR;
  }
  
  String zzGW()
  {
    return zzbjS;
  }
  
  boolean zzp(Uri paramUri)
  {
    boolean bool = true;
    String str;
    try
    {
      str = URLDecoder.decode(paramUri.toString(), "UTF-8");
      if (!str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
        break label147;
      }
      zzbg.v("Container preview url: " + str);
      if (!str.matches(".*?&gtm_debug=x$")) {
        break label132;
      }
      zzbjR = zzcb.zza.zzbjW;
    }
    catch (UnsupportedEncodingException paramUri)
    {
      for (;;)
      {
        bool = false;
        continue;
        zzbjR = zzcb.zza.zzbjV;
      }
    }
    finally {}
    zzbjT = zzq(paramUri);
    if ((zzbjR == zzcb.zza.zzbjV) || (zzbjR == zzcb.zza.zzbjW)) {
      zzbjS = ("/r?" + zzbjT);
    }
    zzbhM = zzgk(zzbjT);
    for (;;)
    {
      return bool;
      label132:
      label147:
      if (str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
      {
        if (zzgk(paramUri.getQuery()).equals(zzbhM))
        {
          zzbg.v("Exit preview mode for container: " + zzbhM);
          zzbjR = zzcb.zza.zzbjU;
          zzbjS = null;
        }
      }
      else
      {
        zzbg.zzaK("Invalid preview uri: " + str);
        bool = false;
        continue;
      }
      bool = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */