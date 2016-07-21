package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;

class zza
{
  private String zzSF;
  private final zzw zzaTV;
  private final String zzaUa;
  private String zzaVc;
  private String zzaVd;
  private String zzaVe;
  private long zzaVf;
  private long zzaVg;
  private long zzaVh;
  private String zzaVi;
  private long zzaVj;
  private long zzaVk;
  private boolean zzaVl;
  private long zzaVm;
  private long zzaVn;
  private long zzaVo;
  private long zzaVp;
  private boolean zzaVq;
  private long zzaVr;
  private long zzaVs;
  
  zza(zzw paramzzw, String paramString)
  {
    zzx.zzz(paramzzw);
    zzx.zzcM(paramString);
    zzaTV = paramzzw;
    zzaUa = paramString;
    zzaTV.zzjk();
  }
  
  public void setAppVersion(String paramString)
  {
    zzaTV.zzjk();
    zzaVq |= zzaj.zzQ(zzSF, paramString);
    zzSF = paramString;
  }
  
  public void setMeasurementEnabled(boolean paramBoolean)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVl != paramBoolean) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVl = paramBoolean;
      return;
    }
  }
  
  public boolean zzAr()
  {
    zzaTV.zzjk();
    return zzaVl;
  }
  
  public void zzBi()
  {
    zzaTV.zzjk();
    zzaVq = false;
  }
  
  public String zzBj()
  {
    zzaTV.zzjk();
    return zzaVc;
  }
  
  public String zzBk()
  {
    zzaTV.zzjk();
    return zzaVd;
  }
  
  public String zzBl()
  {
    zzaTV.zzjk();
    return zzaVe;
  }
  
  public long zzBm()
  {
    zzaTV.zzjk();
    return zzaVg;
  }
  
  public long zzBn()
  {
    zzaTV.zzjk();
    return zzaVh;
  }
  
  public String zzBo()
  {
    zzaTV.zzjk();
    return zzaVi;
  }
  
  public long zzBp()
  {
    zzaTV.zzjk();
    return zzaVj;
  }
  
  public long zzBq()
  {
    zzaTV.zzjk();
    return zzaVk;
  }
  
  public long zzBr()
  {
    zzaTV.zzjk();
    return zzaVf;
  }
  
  public long zzBs()
  {
    zzaTV.zzjk();
    return zzaVr;
  }
  
  public long zzBt()
  {
    zzaTV.zzjk();
    return zzaVs;
  }
  
  public void zzBu()
  {
    zzaTV.zzjk();
    long l2 = zzaVf + 1L;
    long l1 = l2;
    if (l2 > 2147483647L)
    {
      zzaTV.zzAo().zzCF().zzfg("Bundle index overflow");
      l1 = 0L;
    }
    zzaVq = true;
    zzaVf = l1;
  }
  
  public long zzBv()
  {
    zzaTV.zzjk();
    return zzaVm;
  }
  
  public long zzBw()
  {
    zzaTV.zzjk();
    return zzaVn;
  }
  
  public long zzBx()
  {
    zzaTV.zzjk();
    return zzaVo;
  }
  
  public long zzBy()
  {
    zzaTV.zzjk();
    return zzaVp;
  }
  
  public void zzO(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVg != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVg = paramLong;
      return;
    }
  }
  
  public void zzP(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVh != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVh = paramLong;
      return;
    }
  }
  
  public void zzQ(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVj != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVj = paramLong;
      return;
    }
  }
  
  public void zzR(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVk != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVk = paramLong;
      return;
    }
  }
  
  public void zzS(long paramLong)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramLong >= 0L)
    {
      bool2 = true;
      zzx.zzac(bool2);
      zzaTV.zzjk();
      bool2 = zzaVq;
      if (zzaVf == paramLong) {
        break label58;
      }
    }
    for (;;)
    {
      zzaVq = (bool2 | bool1);
      zzaVf = paramLong;
      return;
      bool2 = false;
      break;
      label58:
      bool1 = false;
    }
  }
  
  public void zzT(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVr != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVr = paramLong;
      return;
    }
  }
  
  public void zzU(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVs != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVs = paramLong;
      return;
    }
  }
  
  public void zzV(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVm != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVm = paramLong;
      return;
    }
  }
  
  public void zzW(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVn != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVn = paramLong;
      return;
    }
  }
  
  public void zzX(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVo != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVo = paramLong;
      return;
    }
  }
  
  public void zzY(long paramLong)
  {
    zzaTV.zzjk();
    boolean bool2 = zzaVq;
    if (zzaVp != paramLong) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzaVq = (bool1 | bool2);
      zzaVp = paramLong;
      return;
    }
  }
  
  public void zzeM(String paramString)
  {
    zzaTV.zzjk();
    zzaVq |= zzaj.zzQ(zzaVc, paramString);
    zzaVc = paramString;
  }
  
  public void zzeN(String paramString)
  {
    zzaTV.zzjk();
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = null;
    }
    zzaVq |= zzaj.zzQ(zzaVd, str);
    zzaVd = str;
  }
  
  public void zzeO(String paramString)
  {
    zzaTV.zzjk();
    zzaVq |= zzaj.zzQ(zzaVe, paramString);
    zzaVe = paramString;
  }
  
  public void zzeP(String paramString)
  {
    zzaTV.zzjk();
    zzaVq |= zzaj.zzQ(zzaVi, paramString);
    zzaVi = paramString;
  }
  
  public String zzli()
  {
    zzaTV.zzjk();
    return zzSF;
  }
  
  public String zzwK()
  {
    zzaTV.zzjk();
    return zzaUa;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */