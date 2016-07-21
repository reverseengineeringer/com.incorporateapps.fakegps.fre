package android.support.v7.app;

class ActionBarActivityDelegateBase$1
  implements Runnable
{
  ActionBarActivityDelegateBase$1(ActionBarActivityDelegateBase paramActionBarActivityDelegateBase) {}
  
  public void run()
  {
    if ((ActionBarActivityDelegateBase.access$000(this$0) & 0x1) != 0) {
      ActionBarActivityDelegateBase.access$100(this$0, 0);
    }
    if ((ActionBarActivityDelegateBase.access$000(this$0) & 0x100) != 0) {
      ActionBarActivityDelegateBase.access$100(this$0, 8);
    }
    ActionBarActivityDelegateBase.access$202(this$0, false);
    ActionBarActivityDelegateBase.access$002(this$0, 0);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateBase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */