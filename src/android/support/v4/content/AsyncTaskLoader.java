package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;

public abstract class AsyncTaskLoader
  extends Loader
{
  static final boolean DEBUG = false;
  static final String TAG = "AsyncTaskLoader";
  volatile AsyncTaskLoader.LoadTask mCancellingTask;
  Handler mHandler;
  long mLastLoadCompleteTime = -10000L;
  volatile AsyncTaskLoader.LoadTask mTask;
  long mUpdateThrottle;
  
  public AsyncTaskLoader(Context paramContext)
  {
    super(paramContext);
  }
  
  public boolean cancelLoad()
  {
    if (mTask != null)
    {
      if (mCancellingTask != null)
      {
        if (mTask.waiting)
        {
          mTask.waiting = false;
          mHandler.removeCallbacks(mTask);
        }
        mTask = null;
      }
    }
    else {
      return false;
    }
    if (mTask.waiting)
    {
      mTask.waiting = false;
      mHandler.removeCallbacks(mTask);
      mTask = null;
      return false;
    }
    boolean bool = mTask.cancel(false);
    if (bool) {
      mCancellingTask = mTask;
    }
    mTask = null;
    return bool;
  }
  
  void dispatchOnCancelled(AsyncTaskLoader.LoadTask paramLoadTask, Object paramObject)
  {
    onCanceled(paramObject);
    if (mCancellingTask == paramLoadTask)
    {
      rollbackContentChanged();
      mLastLoadCompleteTime = SystemClock.uptimeMillis();
      mCancellingTask = null;
      executePendingTask();
    }
  }
  
  void dispatchOnLoadComplete(AsyncTaskLoader.LoadTask paramLoadTask, Object paramObject)
  {
    if (mTask != paramLoadTask)
    {
      dispatchOnCancelled(paramLoadTask, paramObject);
      return;
    }
    if (isAbandoned())
    {
      onCanceled(paramObject);
      return;
    }
    commitContentChanged();
    mLastLoadCompleteTime = SystemClock.uptimeMillis();
    mTask = null;
    deliverResult(paramObject);
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (mTask != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramPrintWriter.print(mTask);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(mTask.waiting);
    }
    if (mCancellingTask != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramPrintWriter.print(mCancellingTask);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(mCancellingTask.waiting);
    }
    if (mUpdateThrottle != 0L)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      TimeUtils.formatDuration(mUpdateThrottle, paramPrintWriter);
      paramPrintWriter.print(" mLastLoadCompleteTime=");
      TimeUtils.formatDuration(mLastLoadCompleteTime, SystemClock.uptimeMillis(), paramPrintWriter);
      paramPrintWriter.println();
    }
  }
  
  void executePendingTask()
  {
    if ((mCancellingTask == null) && (mTask != null))
    {
      if (mTask.waiting)
      {
        mTask.waiting = false;
        mHandler.removeCallbacks(mTask);
      }
      if ((mUpdateThrottle > 0L) && (SystemClock.uptimeMillis() < mLastLoadCompleteTime + mUpdateThrottle))
      {
        mTask.waiting = true;
        mHandler.postAtTime(mTask, mLastLoadCompleteTime + mUpdateThrottle);
      }
    }
    else
    {
      return;
    }
    mTask.executeOnExecutor(ModernAsyncTask.THREAD_POOL_EXECUTOR, null);
  }
  
  public abstract Object loadInBackground();
  
  public void onCanceled(Object paramObject) {}
  
  protected void onForceLoad()
  {
    super.onForceLoad();
    cancelLoad();
    mTask = new AsyncTaskLoader.LoadTask(this);
    executePendingTask();
  }
  
  protected Object onLoadInBackground()
  {
    return loadInBackground();
  }
  
  public void setUpdateThrottle(long paramLong)
  {
    mUpdateThrottle = paramLong;
    if (paramLong != 0L) {
      mHandler = new Handler();
    }
  }
  
  public void waitForLoader()
  {
    AsyncTaskLoader.LoadTask localLoadTask = mTask;
    if (localLoadTask != null) {}
    try
    {
      AsyncTaskLoader.LoadTask.access$000(localLoadTask).await();
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.AsyncTaskLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */