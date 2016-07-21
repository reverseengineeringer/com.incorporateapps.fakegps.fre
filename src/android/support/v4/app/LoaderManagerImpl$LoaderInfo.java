package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.content.Loader.OnLoadCompleteListener;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class LoaderManagerImpl$LoaderInfo
  implements Loader.OnLoadCompleteListener
{
  final Bundle mArgs;
  LoaderManager.LoaderCallbacks mCallbacks;
  Object mData;
  boolean mDeliveredData;
  boolean mDestroyed;
  boolean mHaveData;
  final int mId;
  boolean mListenerRegistered;
  Loader mLoader;
  LoaderInfo mPendingLoader;
  boolean mReportNextStart;
  boolean mRetaining;
  boolean mRetainingStarted;
  boolean mStarted;
  
  public LoaderManagerImpl$LoaderInfo(LoaderManagerImpl paramLoaderManagerImpl, int paramInt, Bundle paramBundle, LoaderManager.LoaderCallbacks paramLoaderCallbacks)
  {
    mId = paramInt;
    mArgs = paramBundle;
    mCallbacks = paramLoaderCallbacks;
  }
  
  final void callOnLoadFinished(Loader paramLoader, Object paramObject)
  {
    String str;
    if (mCallbacks != null)
    {
      if (this$0.mActivity == null) {
        break label155;
      }
      str = this$0.mActivity.mFragments.mNoTransactionsBecause;
      this$0.mActivity.mFragments.mNoTransactionsBecause = "onLoadFinished";
    }
    for (;;)
    {
      try
      {
        if (LoaderManagerImpl.DEBUG) {
          Log.v("LoaderManager", "  onLoadFinished in " + paramLoader + ": " + paramLoader.dataToString(paramObject));
        }
        mCallbacks.onLoadFinished(paramLoader, paramObject);
        if (this$0.mActivity != null) {
          this$0.mActivity.mFragments.mNoTransactionsBecause = str;
        }
        mDeliveredData = true;
        return;
      }
      finally
      {
        if (this$0.mActivity != null) {
          this$0.mActivity.mFragments.mNoTransactionsBecause = str;
        }
      }
      label155:
      str = null;
    }
  }
  
  /* Error */
  final void destroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: astore_2
    //   2: getstatic 68	android/support/v4/app/LoaderManagerImpl:DEBUG	Z
    //   5: ifeq +25 -> 30
    //   8: ldc 70
    //   10: new 72	java/lang/StringBuilder
    //   13: dup
    //   14: ldc 111
    //   16: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: aload_2
    //   20: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: invokestatic 102	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   29: pop
    //   30: aload_2
    //   31: iconst_1
    //   32: putfield 113	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mDestroyed	Z
    //   35: aload_2
    //   36: getfield 108	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mDeliveredData	Z
    //   39: istore_1
    //   40: aload_2
    //   41: iconst_0
    //   42: putfield 108	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mDeliveredData	Z
    //   45: aload_2
    //   46: getfield 42	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mCallbacks	Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
    //   49: ifnull +125 -> 174
    //   52: aload_2
    //   53: getfield 115	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   56: ifnull +118 -> 174
    //   59: aload_2
    //   60: getfield 117	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mHaveData	Z
    //   63: ifeq +111 -> 174
    //   66: iload_1
    //   67: ifeq +107 -> 174
    //   70: getstatic 68	android/support/v4/app/LoaderManagerImpl:DEBUG	Z
    //   73: ifeq +25 -> 98
    //   76: ldc 70
    //   78: new 72	java/lang/StringBuilder
    //   81: dup
    //   82: ldc 119
    //   84: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   87: aload_2
    //   88: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: invokestatic 102	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   97: pop
    //   98: aload_2
    //   99: getfield 33	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   102: getfield 51	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   105: ifnull +163 -> 268
    //   108: aload_2
    //   109: getfield 33	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   112: getfield 51	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   115: getfield 57	android/support/v4/app/FragmentActivity:mFragments	Landroid/support/v4/app/FragmentManagerImpl;
    //   118: getfield 63	android/support/v4/app/FragmentManagerImpl:mNoTransactionsBecause	Ljava/lang/String;
    //   121: astore_3
    //   122: aload_2
    //   123: getfield 33	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   126: getfield 51	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   129: getfield 57	android/support/v4/app/FragmentActivity:mFragments	Landroid/support/v4/app/FragmentManagerImpl;
    //   132: ldc 121
    //   134: putfield 63	android/support/v4/app/FragmentManagerImpl:mNoTransactionsBecause	Ljava/lang/String;
    //   137: aload_2
    //   138: getfield 42	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mCallbacks	Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
    //   141: aload_2
    //   142: getfield 115	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   145: invokeinterface 124 2 0
    //   150: aload_2
    //   151: getfield 33	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   154: getfield 51	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   157: ifnull +17 -> 174
    //   160: aload_2
    //   161: getfield 33	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   164: getfield 51	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   167: getfield 57	android/support/v4/app/FragmentActivity:mFragments	Landroid/support/v4/app/FragmentManagerImpl;
    //   170: aload_3
    //   171: putfield 63	android/support/v4/app/FragmentManagerImpl:mNoTransactionsBecause	Ljava/lang/String;
    //   174: aload_2
    //   175: aconst_null
    //   176: putfield 42	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mCallbacks	Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
    //   179: aload_2
    //   180: aconst_null
    //   181: putfield 126	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mData	Ljava/lang/Object;
    //   184: aload_2
    //   185: iconst_0
    //   186: putfield 117	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mHaveData	Z
    //   189: aload_2
    //   190: getfield 115	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   193: ifnull +30 -> 223
    //   196: aload_2
    //   197: getfield 128	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mListenerRegistered	Z
    //   200: ifeq +16 -> 216
    //   203: aload_2
    //   204: iconst_0
    //   205: putfield 128	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mListenerRegistered	Z
    //   208: aload_2
    //   209: getfield 115	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   212: aload_2
    //   213: invokevirtual 132	android/support/v4/content/Loader:unregisterListener	(Landroid/support/v4/content/Loader$OnLoadCompleteListener;)V
    //   216: aload_2
    //   217: getfield 115	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mLoader	Landroid/support/v4/content/Loader;
    //   220: invokevirtual 135	android/support/v4/content/Loader:reset	()V
    //   223: aload_2
    //   224: getfield 137	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mPendingLoader	Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
    //   227: ifnull +40 -> 267
    //   230: aload_2
    //   231: getfield 137	android/support/v4/app/LoaderManagerImpl$LoaderInfo:mPendingLoader	Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
    //   234: astore_2
    //   235: goto -233 -> 2
    //   238: astore 4
    //   240: aload_2
    //   241: getfield 33	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   244: getfield 51	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   247: ifnull +17 -> 264
    //   250: aload_2
    //   251: getfield 33	android/support/v4/app/LoaderManagerImpl$LoaderInfo:this$0	Landroid/support/v4/app/LoaderManagerImpl;
    //   254: getfield 51	android/support/v4/app/LoaderManagerImpl:mActivity	Landroid/support/v4/app/FragmentActivity;
    //   257: getfield 57	android/support/v4/app/FragmentActivity:mFragments	Landroid/support/v4/app/FragmentManagerImpl;
    //   260: aload_3
    //   261: putfield 63	android/support/v4/app/FragmentManagerImpl:mNoTransactionsBecause	Ljava/lang/String;
    //   264: aload 4
    //   266: athrow
    //   267: return
    //   268: aconst_null
    //   269: astore_3
    //   270: goto -133 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	this	LoaderInfo
    //   39	28	1	bool	boolean
    //   1	250	2	localLoaderInfo	LoaderInfo
    //   121	149	3	str	String
    //   238	27	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   137	150	238	finally
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    String str = paramString;
    paramString = this;
    for (;;)
    {
      paramPrintWriter.print(str);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(mId);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(mArgs);
      paramPrintWriter.print(str);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(mCallbacks);
      paramPrintWriter.print(str);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(mLoader);
      if (mLoader != null) {
        mLoader.dump(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
      if ((mHaveData) || (mDeliveredData))
      {
        paramPrintWriter.print(str);
        paramPrintWriter.print("mHaveData=");
        paramPrintWriter.print(mHaveData);
        paramPrintWriter.print("  mDeliveredData=");
        paramPrintWriter.println(mDeliveredData);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mData=");
        paramPrintWriter.println(mData);
      }
      paramPrintWriter.print(str);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(mStarted);
      paramPrintWriter.print(" mReportNextStart=");
      paramPrintWriter.print(mReportNextStart);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(mDestroyed);
      paramPrintWriter.print(str);
      paramPrintWriter.print("mRetaining=");
      paramPrintWriter.print(mRetaining);
      paramPrintWriter.print(" mRetainingStarted=");
      paramPrintWriter.print(mRetainingStarted);
      paramPrintWriter.print(" mListenerRegistered=");
      paramPrintWriter.println(mListenerRegistered);
      if (mPendingLoader == null) {
        break;
      }
      paramPrintWriter.print(str);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(mPendingLoader);
      paramPrintWriter.println(":");
      paramString = mPendingLoader;
      str = str + "  ";
    }
  }
  
  final void finishRetain()
  {
    if (mRetaining)
    {
      if (LoaderManagerImpl.DEBUG) {
        Log.v("LoaderManager", "  Finished Retaining: " + this);
      }
      mRetaining = false;
      if ((mStarted != mRetainingStarted) && (!mStarted)) {
        stop();
      }
    }
    if ((mStarted) && (mHaveData) && (!mReportNextStart)) {
      callOnLoadFinished(mLoader, mData);
    }
  }
  
  public final void onLoadComplete(Loader paramLoader, Object paramObject)
  {
    if (LoaderManagerImpl.DEBUG) {
      Log.v("LoaderManager", "onLoadComplete: " + this);
    }
    if (mDestroyed) {
      if (LoaderManagerImpl.DEBUG) {
        Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
      }
    }
    do
    {
      do
      {
        return;
        if (this$0.mLoaders.get(mId) == this) {
          break;
        }
      } while (!LoaderManagerImpl.DEBUG);
      Log.v("LoaderManager", "  Ignoring load complete -- not active");
      return;
      LoaderInfo localLoaderInfo = mPendingLoader;
      if (localLoaderInfo != null)
      {
        if (LoaderManagerImpl.DEBUG) {
          Log.v("LoaderManager", "  Switching to pending loader: " + localLoaderInfo);
        }
        mPendingLoader = null;
        this$0.mLoaders.put(mId, null);
        destroy();
        this$0.installLoader(localLoaderInfo);
        return;
      }
      if ((mData != paramObject) || (!mHaveData))
      {
        mData = paramObject;
        mHaveData = true;
        if (mStarted) {
          callOnLoadFinished(paramLoader, paramObject);
        }
      }
      paramLoader = (LoaderInfo)this$0.mInactiveLoaders.get(mId);
      if ((paramLoader != null) && (paramLoader != this))
      {
        mDeliveredData = false;
        paramLoader.destroy();
        this$0.mInactiveLoaders.remove(mId);
      }
    } while ((this$0.mActivity == null) || (this$0.hasRunningLoaders()));
    this$0.mActivity.mFragments.startPendingDeferredFragments();
  }
  
  final void reportStart()
  {
    if ((mStarted) && (mReportNextStart))
    {
      mReportNextStart = false;
      if (mHaveData) {
        callOnLoadFinished(mLoader, mData);
      }
    }
  }
  
  final void retain()
  {
    if (LoaderManagerImpl.DEBUG) {
      Log.v("LoaderManager", "  Retaining: " + this);
    }
    mRetaining = true;
    mRetainingStarted = mStarted;
    mStarted = false;
    mCallbacks = null;
  }
  
  final void start()
  {
    if ((mRetaining) && (mRetainingStarted)) {
      mStarted = true;
    }
    do
    {
      do
      {
        return;
      } while (mStarted);
      mStarted = true;
      if (LoaderManagerImpl.DEBUG) {
        Log.v("LoaderManager", "  Starting: " + this);
      }
      if ((mLoader == null) && (mCallbacks != null)) {
        mLoader = mCallbacks.onCreateLoader(mId, mArgs);
      }
    } while (mLoader == null);
    if ((mLoader.getClass().isMemberClass()) && (!Modifier.isStatic(mLoader.getClass().getModifiers()))) {
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mLoader);
    }
    if (!mListenerRegistered)
    {
      mLoader.registerListener(mId, this);
      mListenerRegistered = true;
    }
    mLoader.startLoading();
  }
  
  final void stop()
  {
    if (LoaderManagerImpl.DEBUG) {
      Log.v("LoaderManager", "  Stopping: " + this);
    }
    mStarted = false;
    if ((!mRetaining) && (mLoader != null) && (mListenerRegistered))
    {
      mListenerRegistered = false;
      mLoader.unregisterListener(this);
      mLoader.stopLoading();
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(mId);
    localStringBuilder.append(" : ");
    DebugUtils.buildShortClassTag(mLoader, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.LoaderManagerImpl.LoaderInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */