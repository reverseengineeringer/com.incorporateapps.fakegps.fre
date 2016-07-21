package android.support.v4.content;

import java.util.concurrent.CountDownLatch;

final class AsyncTaskLoader$LoadTask
  extends ModernAsyncTask
  implements Runnable
{
  private CountDownLatch done = new CountDownLatch(1);
  Object result;
  boolean waiting;
  
  AsyncTaskLoader$LoadTask(AsyncTaskLoader paramAsyncTaskLoader) {}
  
  protected final Object doInBackground(Void... paramVarArgs)
  {
    result = this$0.onLoadInBackground();
    return result;
  }
  
  protected final void onCancelled()
  {
    try
    {
      this$0.dispatchOnCancelled(this, result);
      return;
    }
    finally
    {
      done.countDown();
    }
  }
  
  protected final void onPostExecute(Object paramObject)
  {
    try
    {
      this$0.dispatchOnLoadComplete(this, paramObject);
      return;
    }
    finally
    {
      done.countDown();
    }
  }
  
  public final void run()
  {
    waiting = false;
    this$0.executePendingTask();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.AsyncTaskLoader.LoadTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */