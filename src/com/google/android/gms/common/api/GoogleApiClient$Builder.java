package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.view.View;
import com.google.android.gms.common.api.internal.zzj;
import com.google.android.gms.common.api.internal.zzw;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzf.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrl;
import com.google.android.gms.internal.zzro;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class GoogleApiClient$Builder
{
  private final Context mContext;
  private Account zzTI;
  private String zzUW;
  private final Set zzagh = new HashSet();
  private final Set zzagi = new HashSet();
  private int zzagj;
  private View zzagk;
  private String zzagl;
  private final Map zzagm = new ArrayMap();
  private final Map zzagn = new ArrayMap();
  private FragmentActivity zzago;
  private int zzagp = -1;
  private GoogleApiClient.OnConnectionFailedListener zzagq;
  private Looper zzagr;
  private com.google.android.gms.common.zzc zzags = com.google.android.gms.common.zzc.zzoK();
  private Api.zza zzagt = zzrl.zzUJ;
  private final ArrayList zzagu = new ArrayList();
  private final ArrayList zzagv = new ArrayList();
  
  public GoogleApiClient$Builder(Context paramContext)
  {
    mContext = paramContext;
    zzagr = paramContext.getMainLooper();
    zzUW = paramContext.getPackageName();
    zzagl = paramContext.getClass().getName();
  }
  
  public GoogleApiClient$Builder(Context paramContext, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext);
    zzx.zzb(paramConnectionCallbacks, "Must provide a connected listener");
    zzagu.add(paramConnectionCallbacks);
    zzx.zzb(paramOnConnectionFailedListener, "Must provide a connection failed listener");
    zzagv.add(paramOnConnectionFailedListener);
  }
  
  private static Api.zzb zza(Api.zza paramzza, Object paramObject, Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return paramzza.zza(paramContext, paramLooper, paramzzf, paramObject, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  private static zzad zza(Api.zze paramzze, Object paramObject, Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return new zzad(paramContext, paramLooper, paramzze.zzoU(), paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf, paramzze.zzq(paramObject));
  }
  
  private void zza(Api paramApi, Api.ApiOptions paramApiOptions, int paramInt, Scope... paramVarArgs)
  {
    boolean bool = true;
    int i = 0;
    if (paramInt == 1) {}
    for (;;)
    {
      paramApiOptions = new HashSet(paramApi.zzoP().zzo(paramApiOptions));
      int j = paramVarArgs.length;
      paramInt = i;
      while (paramInt < j)
      {
        paramApiOptions.add(paramVarArgs[paramInt]);
        paramInt += 1;
      }
      if (paramInt != 2) {
        break;
      }
      bool = false;
    }
    throw new IllegalArgumentException("Invalid resolution mode: '" + paramInt + "', use a constant from GoogleApiClient.ResolutionMode");
    zzagm.put(paramApi, new zzf.zza(paramApiOptions, bool));
  }
  
  private void zza(zzw paramzzw, GoogleApiClient paramGoogleApiClient)
  {
    paramzzw.zza(zzagp, paramGoogleApiClient, zzagq);
  }
  
  private void zze(GoogleApiClient paramGoogleApiClient)
  {
    zzw localzzw = zzw.zza(zzago);
    if (localzzw == null)
    {
      new Handler(mContext.getMainLooper()).post(new GoogleApiClient.Builder.1(this, paramGoogleApiClient));
      return;
    }
    zza(localzzw, paramGoogleApiClient);
  }
  
  private GoogleApiClient zzoZ()
  {
    zzf localzzf = zzoY();
    Object localObject2 = null;
    Map localMap = localzzf.zzqu();
    ArrayMap localArrayMap1 = new ArrayMap();
    ArrayMap localArrayMap2 = new ArrayMap();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzagn.keySet().iterator();
    Object localObject1 = null;
    Api localApi;
    Object localObject3;
    int i;
    label130:
    com.google.android.gms.common.api.internal.zzc localzzc;
    Object localObject4;
    if (localIterator.hasNext())
    {
      localApi = (Api)localIterator.next();
      localObject3 = zzagn.get(localApi);
      i = 0;
      if (localMap.get(localApi) != null)
      {
        if (getzzalf) {
          i = 1;
        }
      }
      else
      {
        localArrayMap1.put(localApi, Integer.valueOf(i));
        localzzc = new com.google.android.gms.common.api.internal.zzc(localApi, i);
        localArrayList.add(localzzc);
        if (!localApi.zzoS()) {
          break label295;
        }
        localObject4 = localApi.zzoQ();
        if (((Api.zze)localObject4).getPriority() != 1) {
          break label530;
        }
        localObject1 = localApi;
      }
    }
    label216:
    label295:
    label344:
    label522:
    label527:
    label530:
    for (;;)
    {
      localObject3 = zza((Api.zze)localObject4, localObject3, mContext, zzagr, localzzf, localzzc, localzzc);
      localArrayMap2.put(localApi.zzoR(), localObject3);
      if (((Api.zzb)localObject3).zznb())
      {
        localObject3 = localApi;
        if (localObject2 == null) {
          break label344;
        }
        throw new IllegalStateException(localApi.getName() + " cannot be used with " + ((Api)localObject2).getName());
        i = 2;
        break label130;
        localObject4 = localApi.zzoP();
        if (((Api.zza)localObject4).getPriority() != 1) {
          break label527;
        }
        localObject1 = localApi;
      }
      for (;;)
      {
        localObject3 = zza((Api.zza)localObject4, localObject3, mContext, zzagr, localzzf, localzzc, localzzc);
        break label216;
        localObject3 = localObject2;
        localObject2 = localObject3;
        break;
        if (localObject2 != null)
        {
          if (localObject1 != null) {
            throw new IllegalStateException(((Api)localObject2).getName() + " cannot be used with " + ((Api)localObject1).getName());
          }
          if (zzTI != null) {
            break label522;
          }
        }
        for (boolean bool = true;; bool = false)
        {
          zzx.zza(bool, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] { ((Api)localObject2).getName() });
          zzx.zza(zzagh.equals(zzagi), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] { ((Api)localObject2).getName() });
          i = zzj.zza(localArrayMap2.values(), true);
          return new zzj(mContext, new ReentrantLock(), zzagr, localzzf, zzags, zzagt, localArrayMap1, zzagu, zzagv, localArrayMap2, zzagp, i, localArrayList);
        }
      }
    }
  }
  
  public final Builder addApi(Api paramApi)
  {
    zzx.zzb(paramApi, "Api must not be null");
    zzagn.put(paramApi, null);
    paramApi = paramApi.zzoP().zzo(null);
    zzagi.addAll(paramApi);
    zzagh.addAll(paramApi);
    return this;
  }
  
  public final Builder addApi(Api paramApi, Api.ApiOptions.HasOptions paramHasOptions)
  {
    zzx.zzb(paramApi, "Api must not be null");
    zzx.zzb(paramHasOptions, "Null options are not permitted for this Api");
    zzagn.put(paramApi, paramHasOptions);
    paramApi = paramApi.zzoP().zzo(paramHasOptions);
    zzagi.addAll(paramApi);
    zzagh.addAll(paramApi);
    return this;
  }
  
  public final Builder addApiIfAvailable(Api paramApi, Api.ApiOptions.HasOptions paramHasOptions, Scope... paramVarArgs)
  {
    zzx.zzb(paramApi, "Api must not be null");
    zzx.zzb(paramHasOptions, "Null options are not permitted for this Api");
    zzagn.put(paramApi, paramHasOptions);
    zza(paramApi, paramHasOptions, 1, paramVarArgs);
    return this;
  }
  
  public final Builder addApiIfAvailable(Api paramApi, Scope... paramVarArgs)
  {
    zzx.zzb(paramApi, "Api must not be null");
    zzagn.put(paramApi, null);
    zza(paramApi, null, 1, paramVarArgs);
    return this;
  }
  
  public final Builder addConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzx.zzb(paramConnectionCallbacks, "Listener must not be null");
    zzagu.add(paramConnectionCallbacks);
    return this;
  }
  
  public final Builder addOnConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzb(paramOnConnectionFailedListener, "Listener must not be null");
    zzagv.add(paramOnConnectionFailedListener);
    return this;
  }
  
  public final Builder addScope(Scope paramScope)
  {
    zzx.zzb(paramScope, "Scope must not be null");
    zzagh.add(paramScope);
    return this;
  }
  
  public final GoogleApiClient build()
  {
    boolean bool;
    if (!zzagn.isEmpty()) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "must call addApi() to add at least one API");
      GoogleApiClient localGoogleApiClient = zzoZ();
      synchronized (GoogleApiClient.zzoX())
      {
        GoogleApiClient.zzoX().add(localGoogleApiClient);
        if (zzagp >= 0) {
          zze(localGoogleApiClient);
        }
        return localGoogleApiClient;
        bool = false;
      }
    }
  }
  
  public final Builder enableAutoManage(FragmentActivity paramFragmentActivity, int paramInt, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "clientId must be non-negative");
      zzagp = paramInt;
      zzago = ((FragmentActivity)zzx.zzb(paramFragmentActivity, "Null activity is not permitted."));
      zzagq = paramOnConnectionFailedListener;
      return this;
    }
  }
  
  public final Builder enableAutoManage(FragmentActivity paramFragmentActivity, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return enableAutoManage(paramFragmentActivity, 0, paramOnConnectionFailedListener);
  }
  
  public final Builder setAccountName(String paramString)
  {
    if (paramString == null) {}
    for (paramString = null;; paramString = new Account(paramString, "com.google"))
    {
      zzTI = paramString;
      return this;
    }
  }
  
  public final Builder setGravityForPopups(int paramInt)
  {
    zzagj = paramInt;
    return this;
  }
  
  public final Builder setHandler(Handler paramHandler)
  {
    zzx.zzb(paramHandler, "Handler must not be null");
    zzagr = paramHandler.getLooper();
    return this;
  }
  
  public final Builder setViewForPopups(View paramView)
  {
    zzx.zzb(paramView, "View must not be null");
    zzagk = paramView;
    return this;
  }
  
  public final Builder useDefaultAccount()
  {
    return setAccountName("<<default account>>");
  }
  
  public final zzf zzoY()
  {
    zzro localzzro = zzro.zzbgV;
    if (zzagn.containsKey(zzrl.API)) {
      localzzro = (zzro)zzagn.get(zzrl.API);
    }
    return new zzf(zzTI, zzagh, zzagm, zzagj, zzagk, zzUW, zzagl, localzzro);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiClient.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */