package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class zzig
{
  private boolean zzJu = false;
  private final LinkedList zzLf;
  private final String zzLg;
  private final String zzLh;
  private long zzLi = -1L;
  private long zzLj = -1L;
  private long zzLk = -1L;
  private long zzLl = 0L;
  private long zzLm = -1L;
  private long zzLn = -1L;
  private final Object zzpV = new Object();
  private final zzih zzqV;
  
  public zzig(zzih paramzzih, String paramString1, String paramString2)
  {
    zzqV = paramzzih;
    zzLg = paramString1;
    zzLh = paramString2;
    zzLf = new LinkedList();
  }
  
  public zzig(String paramString1, String paramString2)
  {
    this(zzr.zzbF(), paramString1, paramString2);
  }
  
  public Bundle toBundle()
  {
    ArrayList localArrayList;
    synchronized (zzpV)
    {
      Bundle localBundle1 = new Bundle();
      localBundle1.putString("seq_num", zzLg);
      localBundle1.putString("slotid", zzLh);
      localBundle1.putBoolean("ismediation", zzJu);
      localBundle1.putLong("treq", zzLm);
      localBundle1.putLong("tresponse", zzLn);
      localBundle1.putLong("timp", zzLj);
      localBundle1.putLong("tload", zzLk);
      localBundle1.putLong("pcc", zzLl);
      localBundle1.putLong("tfetch", zzLi);
      localArrayList = new ArrayList();
      Iterator localIterator = zzLf.iterator();
      if (localIterator.hasNext()) {
        localArrayList.add(((zzig.zza)localIterator.next()).toBundle());
      }
    }
    localBundle2.putParcelableArrayList("tclick", localArrayList);
    return localBundle2;
  }
  
  public void zzA(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      if (zzLn != -1L)
      {
        zzJu = paramBoolean;
        zzqV.zza(this);
      }
      return;
    }
  }
  
  public void zzgS()
  {
    synchronized (zzpV)
    {
      if ((zzLn != -1L) && (zzLj == -1L))
      {
        zzLj = SystemClock.elapsedRealtime();
        zzqV.zza(this);
      }
      zzqV.zzha().zzgS();
      return;
    }
  }
  
  public void zzgT()
  {
    synchronized (zzpV)
    {
      if (zzLn != -1L)
      {
        zzig.zza localzza = new zzig.zza();
        localzza.zzgX();
        zzLf.add(localzza);
        zzLl += 1L;
        zzqV.zzha().zzgT();
        zzqV.zza(this);
      }
      return;
    }
  }
  
  public void zzgU()
  {
    synchronized (zzpV)
    {
      if ((zzLn != -1L) && (!zzLf.isEmpty()))
      {
        zzig.zza localzza = (zzig.zza)zzLf.getLast();
        if (localzza.zzgV() == -1L)
        {
          localzza.zzgW();
          zzqV.zza(this);
        }
      }
      return;
    }
  }
  
  public void zzk(AdRequestParcel paramAdRequestParcel)
  {
    synchronized (zzpV)
    {
      zzLm = SystemClock.elapsedRealtime();
      zzqV.zzha().zzb(paramAdRequestParcel, zzLm);
      return;
    }
  }
  
  public void zzl(long paramLong)
  {
    synchronized (zzpV)
    {
      zzLn = paramLong;
      if (zzLn != -1L) {
        zzqV.zza(this);
      }
      return;
    }
  }
  
  public void zzm(long paramLong)
  {
    synchronized (zzpV)
    {
      if (zzLn != -1L)
      {
        zzLi = paramLong;
        zzqV.zza(this);
      }
      return;
    }
  }
  
  public void zzz(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      if (zzLn != -1L)
      {
        zzLk = SystemClock.elapsedRealtime();
        if (!paramBoolean)
        {
          zzLj = zzLk;
          zzqV.zza(this);
        }
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */