
//二叉树类，用于单词输入库和查找
public class TrieCheck {

    private Node root;

//************************************************

    public void addWork(String src[]){
        root = new Node();
        for (String s : src){
            add(root,s);
        }
    }
    public void searchWork(String des[]){
        for(String s : des) {
            int num = search(root, s);
            System.out.println(num);
        }
    }


    private void add(Node node,String src){
        if(src == null || src.length() == 0){
            return;
        }
        else {
            char srcChar[] = src.toCharArray();
            for(int i = 0;i < srcChar.length;i ++){
                int foot = srcChar[i] - 'a';
                if(node.child[foot] == null){
                    node.child[foot] = new Node();
                }
                else {
                    node.child[foot].nCount ++;
                }
                node.data = srcChar[i];
                node = node.child[foot];
            }

        }

    }


    public int search(Node node,String des){
        if(des == null || des.length() == 0){
            return -1;
        }
        else {
            char desChar[] = des.toCharArray();
            for(int i = 0;i < desChar.length;i ++){
                int foot = desChar[i] - 'a';
                if(node.child[foot] == null){
                    return 0;
                }
                else {
                    node = node.child[foot];
                }
            }
            return node.nCount;
        }
    }

//***************************************************

    public class Node{
        public int nCount;
        private char data;
        Node child[];
        public Node(){
            nCount = 1;
            child = new Node[26];
        }


        //***************************************************
    }
}
