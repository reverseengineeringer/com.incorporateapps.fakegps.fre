package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzw
  extends Fragment
  implements DialogInterface.OnCancelListener
{
  private boolean mStarted;
  private int zzaiA = -1;
  private ConnectionResult zzaiB;
  private final Handler zzaiC = new Handler(Looper.getMainLooper());
  protected zzn zzaiD;
  private final SparseArray zzaiE = new SparseArray();
  private boolean zzaiz;
  
  public static zzw zza(FragmentActivity paramFragmentActivity)
  {
    zzx.zzcD("Must be called from main thread of process");
    paramFragmentActivity = paramFragmentActivity.getSupportFragmentManager();
    try
    {
      zzw localzzw = (zzw)paramFragmentActivity.findFragmentByTag("GmsSupportLifecycleFrag");
      if (localzzw != null)
      {
        paramFragmentActivity = localzzw;
        if (!localzzw.isRemoving()) {}
      }
      else
      {
        paramFragmentActivity = null;
      }
      return paramFragmentActivity;
    }
    catch (ClassCastException paramFragmentActivity)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFrag is not a SupportLifecycleFragment", paramFragmentActivity);
    }
  }
  
  private void zza(int paramInt, ConnectionResult paramConnectionResult)
  {
    Log.w("GmsSupportLifecycleFrag", "Unresolved error while connecting client. Stopping auto-manage.");
    Object localObject = (zzw.zza)zzaiE.get(paramInt);
    if (localObject != null)
    {
      zzbD(paramInt);
      localObject = zzaiH;
      if (localObject != null) {
        ((GoogleApiClient.OnConnectionFailedListener)localObject).onConnectionFailed(paramConnectionResult);
      }
    }
    zzpP();
  }
  
  public static zzw zzb(FragmentActivity paramFragmentActivity)
  {
    zzw localzzw = zza(paramFragmentActivity);
    FragmentManager localFragmentManager = paramFragmentActivity.getSupportFragmentManager();
    paramFragmentActivity = localzzw;
    if (localzzw == null)
    {
      localzzw = zzpO();
      paramFragmentActivity = localzzw;
      if (localzzw == null)
      {
        Log.w("GmsSupportLifecycleFrag", "Unable to find connection error message resources (Did you include play-services-base and the proper proguard rules?); error dialogs may be unavailable.");
        paramFragmentActivity = new zzw();
      }
      localFragmentManager.beginTransaction().add(paramFragmentActivity, "GmsSupportLifecycleFrag").commitAllowingStateLoss();
      localFragmentManager.executePendingTransactions();
    }
    return paramFragmentActivity;
  }
  
  private static String zzi(ConnectionResult paramConnectionResult)
  {
    return paramConnectionResult.getErrorMessage() + " (" + paramConnectionResult.getErrorCode() + ": " + zze.getErrorString(paramConnectionResult.getErrorCode()) + ')';
  }
  
  /* Error */
  private static zzw zzpO()
  {
    // Byte code:
    //   0: ldc -48
    //   2: invokestatic 214	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   5: astore_0
    //   6: aload_0
    //   7: ifnull +56 -> 63
    //   10: aload_0
    //   11: invokevirtual 218	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   14: checkcast 2	com/google/android/gms/common/api/internal/zzw
    //   17: astore_0
    //   18: aload_0
    //   19: areturn
    //   20: astore_0
    //   21: ldc 68
    //   23: iconst_3
    //   24: invokestatic 222	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   27: ifeq +12 -> 39
    //   30: ldc 68
    //   32: ldc -32
    //   34: aload_0
    //   35: invokestatic 228	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   38: pop
    //   39: aconst_null
    //   40: astore_0
    //   41: goto -35 -> 6
    //   44: astore_0
    //   45: ldc 68
    //   47: iconst_3
    //   48: invokestatic 222	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   51: ifeq +12 -> 63
    //   54: ldc 68
    //   56: ldc -26
    //   58: aload_0
    //   59: invokestatic 228	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   62: pop
    //   63: aconst_null
    //   64: areturn
    //   65: astore_0
    //   66: goto -21 -> 45
    //   69: astore_0
    //   70: goto -25 -> 45
    //   73: astore_0
    //   74: goto -29 -> 45
    //   77: astore_0
    //   78: goto -57 -> 21
    //   81: astore_0
    //   82: goto -61 -> 21
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	14	0	localObject1	Object
    //   20	15	0	localClassNotFoundException	ClassNotFoundException
    //   40	1	0	localObject2	Object
    //   44	15	0	localInstantiationException	InstantiationException
    //   65	1	0	localRuntimeException	RuntimeException
    //   69	1	0	localIllegalAccessException	IllegalAccessException
    //   73	1	0	localExceptionInInitializerError	ExceptionInInitializerError
    //   77	1	0	localLinkageError	LinkageError
    //   81	1	0	localSecurityException	SecurityException
    // Exception table:
    //   from	to	target	type
    //   0	6	20	java/lang/ClassNotFoundException
    //   10	18	44	java/lang/InstantiationException
    //   10	18	65	java/lang/RuntimeException
    //   10	18	69	java/lang/IllegalAccessException
    //   10	18	73	java/lang/ExceptionInInitializerError
    //   0	6	77	java/lang/LinkageError
    //   0	6	81	java/lang/SecurityException
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    int i = 0;
    while (i < zzaiE.size())
    {
      ((zzw.zza)zzaiE.valueAt(i)).dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      i += 1;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      paramInt1 = 0;
      do
      {
        for (;;)
        {
          if (paramInt1 == 0) {
            break label88;
          }
          zzpP();
          return;
          if (zzpQ().isGooglePlayServicesAvailable(getActivity()) != 0) {
            break;
          }
          paramInt1 = i;
        }
        paramInt1 = i;
      } while (paramInt2 == -1);
      if (paramInt2 == 0) {
        zzaiB = new ConnectionResult(13, null);
      }
    }
    label88:
    zza(zzaiA, zzaiB);
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    zza(zzaiA, new ConnectionResult(13, null));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      zzaiz = paramBundle.getBoolean("resolving_error", false);
      zzaiA = paramBundle.getInt("failed_client_id", -1);
      if (zzaiA >= 0) {
        zzaiB = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("resolving_error", zzaiz);
    if (zzaiA >= 0)
    {
      paramBundle.putInt("failed_client_id", zzaiA);
      paramBundle.putInt("failed_status", zzaiB.getErrorCode());
      paramBundle.putParcelable("failed_resolution", zzaiB.getResolution());
    }
  }
  
  public void onStart()
  {
    super.onStart();
    mStarted = true;
    if (!zzaiz)
    {
      int i = 0;
      while (i < zzaiE.size())
      {
        zzaiE.valueAt(i)).zzaiG.connect();
        i += 1;
      }
    }
  }
  
  public void onStop()
  {
    super.onStop();
    mStarted = false;
    int i = 0;
    while (i < zzaiE.size())
    {
      zzaiE.valueAt(i)).zzaiG.disconnect();
      i += 1;
    }
  }
  
  public void zza(int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzb(paramGoogleApiClient, "GoogleApiClient instance cannot be null");
    if (zzaiE.indexOfKey(paramInt) < 0) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Already managing a GoogleApiClient with id " + paramInt);
      paramOnConnectionFailedListener = new zzw.zza(this, paramInt, paramGoogleApiClient, paramOnConnectionFailedListener);
      zzaiE.put(paramInt, paramOnConnectionFailedListener);
      if ((mStarted) && (!zzaiz)) {
        paramGoogleApiClient.connect();
      }
      return;
    }
  }
  
  protected void zzb(int paramInt, ConnectionResult paramConnectionResult)
  {
    Log.w("GmsSupportLifecycleFrag", "Failed to connect due to user resolvable error " + zzi(paramConnectionResult));
    zza(paramInt, paramConnectionResult);
  }
  
  public void zzbD(int paramInt)
  {
    zzw.zza localzza = (zzw.zza)zzaiE.get(paramInt);
    zzaiE.remove(paramInt);
    if (localzza != null) {
      localzza.zzpR();
    }
  }
  
  protected void zzc(int paramInt, ConnectionResult paramConnectionResult)
  {
    Log.w("GmsSupportLifecycleFrag", "Unable to connect, GooglePlayServices is updating.");
    zza(paramInt, paramConnectionResult);
  }
  
  protected void zzpP()
  {
    zzaiz = false;
    zzaiA = -1;
    zzaiB = null;
    if (zzaiD != null)
    {
      zzaiD.unregister();
      zzaiD = null;
    }
    int i = 0;
    while (i < zzaiE.size())
    {
      zzaiE.valueAt(i)).zzaiG.connect();
      i += 1;
    }
  }
  
  protected zzc zzpQ()
  {
    return zzc.zzoK();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */