package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

public abstract class Task
  implements Parcelable
{
  public static final int EXTRAS_LIMIT_BYTES = 10240;
  public static final int NETWORK_STATE_ANY = 2;
  public static final int NETWORK_STATE_CONNECTED = 0;
  public static final int NETWORK_STATE_UNMETERED = 1;
  protected static final long UNINITIALIZED = -1L;
  private final Bundle mExtras;
  private final String mTag;
  private final String zzaMh;
  private final boolean zzaMi;
  private final boolean zzaMj;
  private final int zzaMk;
  private final boolean zzaMl;
  private final zzd zzaMm;
  
  Task(Parcel paramParcel)
  {
    Log.e("Task", "Constructing a Task object using a parcel.");
    zzaMh = paramParcel.readString();
    mTag = paramParcel.readString();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      zzaMi = bool1;
      if (paramParcel.readInt() != 1) {
        break label88;
      }
    }
    label88:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzaMj = bool1;
      zzaMk = 2;
      zzaMl = false;
      zzaMm = zzd.zzaMc;
      mExtras = null;
      return;
      bool1 = false;
      break;
    }
  }
  
  Task(Task.Builder paramBuilder)
  {
    zzaMh = gcmTaskService;
    mTag = tag;
    zzaMi = updateCurrent;
    zzaMj = isPersisted;
    zzaMk = requiredNetworkState;
    zzaMl = requiresCharging;
    zzaMm = zzaMn;
    mExtras = extras;
  }
  
  private static boolean zzD(Object paramObject)
  {
    return ((paramObject instanceof Integer)) || ((paramObject instanceof Long)) || ((paramObject instanceof Double)) || ((paramObject instanceof String)) || ((paramObject instanceof Boolean));
  }
  
  public static void zzG(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      Object localObject = Parcel.obtain();
      paramBundle.writeToParcel((Parcel)localObject, 0);
      int i = ((Parcel)localObject).dataSize();
      if (i > 10240)
      {
        ((Parcel)localObject).recycle();
        throw new IllegalArgumentException("Extras exceeding maximum size(10240 bytes): " + i);
      }
      ((Parcel)localObject).recycle();
      localObject = paramBundle.keySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        if (!zzD(paramBundle.get((String)((Iterator)localObject).next()))) {
          throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean. ");
        }
      }
    }
  }
  
  public static void zza(zzd paramzzd)
  {
    if (paramzzd != null)
    {
      int i = paramzzd.zzym();
      if ((i != 1) && (i != 0)) {
        throw new IllegalArgumentException("Must provide a valid RetryPolicy: " + i);
      }
      int j = paramzzd.zzyn();
      int k = paramzzd.zzyo();
      if ((i == 0) && (j < 0)) {
        throw new IllegalArgumentException("InitialBackoffSeconds can't be negative: " + j);
      }
      if ((i == 1) && (j < 10)) {
        throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
      }
      if (k < j) {
        throw new IllegalArgumentException("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: " + paramzzd.zzyo());
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  public int getRequiredNetwork()
  {
    return zzaMk;
  }
  
  public boolean getRequiresCharging()
  {
    return zzaMl;
  }
  
  public String getServiceName()
  {
    return zzaMh;
  }
  
  public String getTag()
  {
    return mTag;
  }
  
  public boolean isPersisted()
  {
    return zzaMj;
  }
  
  public boolean isUpdateCurrent()
  {
    return zzaMi;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    paramBundle.putString("tag", mTag);
    paramBundle.putBoolean("update_current", zzaMi);
    paramBundle.putBoolean("persisted", zzaMj);
    paramBundle.putString("service", zzaMh);
    paramBundle.putInt("requiredNetwork", zzaMk);
    paramBundle.putBoolean("requiresCharging", zzaMl);
    paramBundle.putBundle("retryStrategy", zzaMm.zzF(new Bundle()));
    paramBundle.putBundle("extras", mExtras);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(zzaMh);
    paramParcel.writeString(mTag);
    if (zzaMi)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!zzaMj) {
        break label52;
      }
    }
    label52:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
      paramInt = 0;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.gcm.Task
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */