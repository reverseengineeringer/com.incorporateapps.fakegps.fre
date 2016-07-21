package com.google.android.gms.internal;

class zzeg$2
  implements zzji.zzc
{
  zzeg$2(zzeg paramzzeg, zzeg.zze paramzze) {}
  
  public void zza(zzed arg1)
  {
    synchronized (zzeg.zzc(zzBe))
    {
      zzeg.zza(zzBe, 0);
      if ((zzeg.zzg(zzBe) != null) && (zzBl != zzeg.zzg(zzBe)))
      {
        zzin.v("New JS engine is loaded, marking previous one as destroyable.");
        zzeg.zzg(zzBe).zzeu();
      }
      zzeg.zza(zzBe, zzBl);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeg.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */