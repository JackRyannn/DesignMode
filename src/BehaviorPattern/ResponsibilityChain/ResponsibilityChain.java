package BehaviorPattern.ResponsibilityChain;

import java.util.ArrayList;

public class ResponsibilityChain implements Filter {
    //        记录运行到责任链的第几个节点了,但该责任链只能使用一次，再次使用需要重置index
    int index = 0;

    ArrayList<Filter> list = new ArrayList<Filter>();

    public void addFilter(Filter filter){
        list.add(filter);
    }


    @Override
    public void doFilter(Request request,ResponsibilityChain chain) {
        if(index >= list.size())
            return;
        Filter filter = list.get(index);
        index++;
        filter.doFilter(request,chain);
    }
}
