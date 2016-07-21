package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzf.zza;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzrn;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public class zzh
  implements zzk
{
  private final Context mContext;
  private final Lock zzXG;
  private final zzc zzags;
  private final Api.zza zzagt;
  private final Map zzahA;
  private ArrayList zzahB = new ArrayList();
  private final zzl zzahj;
  private ConnectionResult zzahm;
  private int zzahn;
  private int zzaho = 0;
  private int zzahp;
  private final Bundle zzahq = new Bundle();
  private final Set zzahr = new HashSet();
  private zzrn zzahs;
  private int zzaht;
  private boolean zzahu;
  private boolean zzahv;
  private zzp zzahw;
  private boolean zzahx;
  private boolean zzahy;
  private final zzf zzahz;
  
  public zzh(zzl paramzzl, zzf paramzzf, Map paramMap, zzc paramzzc, Api.zza paramzza, Lock paramLock, Context paramContext)
  {
    zzahj = paramzzl;
    zzahz = paramzzf;
    zzahA = paramMap;
    zzags = paramzzc;
    zzagt = paramzza;
    zzXG = paramLock;
    mContext = paramContext;
  }
  
  private void zzZ(boolean paramBoolean)
  {
    if (zzahs != null)
    {
      if ((zzahs.isConnected()) && (paramBoolean)) {
        zzahs.zzFG();
      }
      zzahs.disconnect();
      zzahw = null;
    }
  }
  
  private void zza(SignInResponse paramSignInResponse)
  {
    if (!zzbz(0)) {
      return;
    }
    ConnectionResult localConnectionResult = paramSignInResponse.zzqY();
    if (localConnectionResult.isSuccess())
    {
      paramSignInResponse = paramSignInResponse.zzFP();
      localConnectionResult = paramSignInResponse.zzqY();
      if (!localConnectionResult.isSuccess())
      {
        Log.wtf("GoogleApiClientConnecting", "Sign-in succeeded with resolve account failure: " + localConnectionResult, new Exception());
        zzg(localConnectionResult);
        return;
      }
      zzahv = true;
      zzahw = paramSignInResponse.zzqX();
      zzahx = paramSignInResponse.zzqZ();
      zzahy = paramSignInResponse.zzra();
      zzpv();
      return;
    }
    if (zzf(localConnectionResult))
    {
      zzpy();
      zzpv();
      return;
    }
    zzg(localConnectionResult);
  }
  
  private boolean zza(int paramInt1, int paramInt2, ConnectionResult paramConnectionResult)
  {
    if ((paramInt2 == 1) && (!zze(paramConnectionResult))) {}
    while ((zzahm != null) && (paramInt1 >= zzahn)) {
      return false;
    }
    return true;
  }
  
  private void zzb(ConnectionResult paramConnectionResult, Api paramApi, int paramInt)
  {
    if (paramInt != 2)
    {
      int i = paramApi.zzoP().getPriority();
      if (zza(i, paramInt, paramConnectionResult))
      {
        zzahm = paramConnectionResult;
        zzahn = i;
      }
    }
    zzahj.zzaio.put(paramApi.zzoR(), paramConnectionResult);
  }
  
  private String zzbA(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 0: 
      return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }
    return "STEP_GETTING_REMOTE_SERVICE";
  }
  
  private boolean zzbz(int paramInt)
  {
    if (zzaho != paramInt)
    {
      Log.i("GoogleApiClientConnecting", zzahj.zzagW.zzpH());
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + zzbA(zzaho) + " but received callback for step " + zzbA(paramInt), new Exception());
      zzg(new ConnectionResult(8, null));
      return false;
    }
    return true;
  }
  
  private boolean zze(ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult.hasResolution()) {}
    while (zzags.zzbu(paramConnectionResult.getErrorCode()) != null) {
      return true;
    }
    return false;
  }
  
  private boolean zzf(ConnectionResult paramConnectionResult)
  {
    return (zzaht == 2) || ((zzaht == 1) && (!paramConnectionResult.hasResolution()));
  }
  
  private void zzg(ConnectionResult paramConnectionResult)
  {
    zzpz();
    if (!paramConnectionResult.hasResolution()) {}
    for (boolean bool = true;; bool = false)
    {
      zzZ(bool);
      zzahj.zzh(paramConnectionResult);
      zzahj.zzais.zzd(paramConnectionResult);
      return;
    }
  }
  
  private Set zzpA()
  {
    if (zzahz == null) {
      return Collections.emptySet();
    }
    HashSet localHashSet = new HashSet(zzahz.zzqs());
    Map localMap = zzahz.zzqu();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Api localApi = (Api)localIterator.next();
      if (!zzahj.zzaio.containsKey(localApi.zzoR())) {
        localHashSet.addAll(getzzXf);
      }
    }
    return localHashSet;
  }
  
  private boolean zzpu()
  {
    zzahp -= 1;
    if (zzahp > 0) {
      return false;
    }
    if (zzahp < 0)
    {
      Log.i("GoogleApiClientConnecting", zzahj.zzagW.zzpH());
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
      zzg(new ConnectionResult(8, null));
      return false;
    }
    if (zzahm != null)
    {
      zzahj.zzair = zzahn;
      zzg(zzahm);
      return false;
    }
    return true;
  }
  
  private void zzpv()
  {
    if (zzahp != 0) {}
    while ((zzahu) && (!zzahv)) {
      return;
    }
    zzpw();
  }
  
  private void zzpw()
  {
    ArrayList localArrayList = new ArrayList();
    zzaho = 1;
    zzahp = zzahj.zzahT.size();
    Iterator localIterator = zzahj.zzahT.keySet().iterator();
    while (localIterator.hasNext())
    {
      Api.zzc localzzc = (Api.zzc)localIterator.next();
      if (zzahj.zzaio.containsKey(localzzc))
      {
        if (zzpu()) {
          zzpx();
        }
      }
      else {
        localArrayList.add(zzahj.zzahT.get(localzzc));
      }
    }
    if (!localArrayList.isEmpty()) {
      zzahB.add(zzm.zzpN().submit(new zzh.zzc(this, localArrayList)));
    }
  }
  
  private void zzpx()
  {
    zzahj.zzpL();
    zzm.zzpN().execute(new zzh.1(this));
    if (zzahs != null)
    {
      if (zzahx) {
        zzahs.zza(zzahw, zzahy);
      }
      zzZ(false);
    }
    Object localObject = zzahj.zzaio.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Api.zzc localzzc = (Api.zzc)((Iterator)localObject).next();
      ((Api.zzb)zzahj.zzahT.get(localzzc)).disconnect();
    }
    if (zzahq.isEmpty()) {}
    for (localObject = null;; localObject = zzahq)
    {
      zzahj.zzais.zzi((Bundle)localObject);
      return;
    }
  }
  
  private void zzpy()
  {
    zzahu = false;
    zzahj.zzagW.zzahU = Collections.emptySet();
    Iterator localIterator = zzahr.iterator();
    while (localIterator.hasNext())
    {
      Api.zzc localzzc = (Api.zzc)localIterator.next();
      if (!zzahj.zzaio.containsKey(localzzc)) {
        zzahj.zzaio.put(localzzc, new ConnectionResult(17, null));
      }
    }
  }
  
  private void zzpz()
  {
    Iterator localIterator = zzahB.iterator();
    while (localIterator.hasNext()) {
      ((Future)localIterator.next()).cancel(true);
    }
    zzahB.clear();
  }
  
  public void begin()
  {
    zzahj.zzaio.clear();
    zzahu = false;
    zzahm = null;
    zzaho = 0;
    zzaht = 2;
    zzahv = false;
    zzahx = false;
    HashMap localHashMap = new HashMap();
    Object localObject = zzahA.keySet().iterator();
    int i = 0;
    if (((Iterator)localObject).hasNext())
    {
      Api localApi = (Api)((Iterator)localObject).next();
      Api.zzb localzzb = (Api.zzb)zzahj.zzahT.get(localApi.zzoR());
      int k = ((Integer)zzahA.get(localApi)).intValue();
      if (localApi.zzoP().getPriority() == 1) {}
      for (int j = 1;; j = 0)
      {
        if (localzzb.zzmE())
        {
          zzahu = true;
          if (k < zzaht) {
            zzaht = k;
          }
          if (k != 0) {
            zzahr.add(localApi.zzoR());
          }
        }
        localHashMap.put(localzzb, new zzh.zza(this, localApi, k));
        i = j | i;
        break;
      }
    }
    if (i != 0) {
      zzahu = false;
    }
    if (zzahu)
    {
      zzahz.zza(Integer.valueOf(zzahj.zzagW.getSessionId()));
      localObject = new zzh.zze(this, null);
      zzahs = ((zzrn)zzagt.zza(mContext, zzahj.zzagW.getLooper(), zzahz, zzahz.zzqy(), (GoogleApiClient.ConnectionCallbacks)localObject, (GoogleApiClient.OnConnectionFailedListener)localObject));
    }
    zzahp = zzahj.zzahT.size();
    zzahB.add(zzm.zzpN().submit(new zzh.zzb(this, localHashMap)));
  }
  
  public void connect() {}
  
  public boolean disconnect()
  {
    zzpz();
    zzZ(true);
    zzahj.zzh(null);
    return true;
  }
  
  public void onConnected(Bundle paramBundle)
  {
    if (!zzbz(1)) {}
    do
    {
      return;
      if (paramBundle != null) {
        zzahq.putAll(paramBundle);
      }
    } while (!zzpu());
    zzpx();
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    zzg(new ConnectionResult(8, null));
  }
  
  public zza.zza zza(zza.zza paramzza)
  {
    zzahj.zzagW.zzahN.add(paramzza);
    return paramzza;
  }
  
  public void zza(ConnectionResult paramConnectionResult, Api paramApi, int paramInt)
  {
    if (!zzbz(1)) {}
    do
    {
      return;
      zzb(paramConnectionResult, paramApi, paramInt);
    } while (!zzpu());
    zzpx();
  }
  
  public zza.zza zzb(zza.zza paramzza)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */